/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.member;

import dao.Course;
import dao.Semester;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import renderer.ComboBoxRenderer;
import renderer.ItemComboBox;
import services.CourseService;
import services.SemesterService;

public class SemestersManagement extends javax.swing.JFrame {

    /**
     * Creates new form UsersManagement
     */
    public SemestersManagement() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSemester = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSemesterName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        dcStartTime = new com.toedter.calendar.JDateChooser();
        dcEndTime = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        cbCourse = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ KỲ HỌC");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Quản lý kỳ học");

        tbSemester.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ID", "Tên kỳ học", "Ngày bắt đầu", "Ngày kết thúc", "Tên khóa học", "CourseId"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbSemester.getTableHeader().setResizingAllowed(false);
        tbSemester.getTableHeader().setReorderingAllowed(false);
        tbSemester.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSemesterMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSemester);

        jLabel2.setText("ID:");

        txtId.setEditable(false);
        txtId.setEnabled(false);

        jLabel3.setText("Tên kỳ học:");

        jLabel4.setText("Ngày bắt đầu:");

        jButton1.setText("Đóng");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAdd.setText("Thêm mới");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel6.setText("Ngày kết thúc:");

        dcStartTime.setDateFormatString("dd-MM-yyyy");

        dcEndTime.setDateFormatString("dd-MM-yyyy");

        jLabel5.setText("Khóa học:");

        jLabel7.setText("Tìm kiếm theo tên:");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtId)
                                    .addComponent(txtSemesterName)
                                    .addComponent(dcStartTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dcEndTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(jLabel1)))
                .addGap(0, 46, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(427, 427, 427)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSemesterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dcStartTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dcEndTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnEdit)
                            .addComponent(btnDelete))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            tbSemester.removeColumn(tbSemester.getColumnModel().getColumn(6));
        } catch (Exception e) {

        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        List<Semester> semesters = semesterService.getAllSemesters();

        DefaultTableModel model = (DefaultTableModel) tbSemester.getModel();
        for (int i = 0; i < semesters.size(); i++) {
            Semester semester = semesters.get(i);
            model.addRow(new Object[]{i + 1, semester.getSemesterId(), semester.getSemesterName(),
                simpleDateFormat.format(semester.getStartTime()), simpleDateFormat.format(semester.getEndTime()),
                semester.getCourse().getCourseName(), semester.getCourse().getCourseId()});
        }

        List<Course> courses = courseService.getAllCourses();

        if (courses.size() == 0) {
            return;
        }

        DefaultComboBoxModel defaultComboBoxModel = (DefaultComboBoxModel) cbCourse.getModel();
        for (Course course : courses) {
            defaultComboBoxModel.addElement(new ItemComboBox(course.getCourseId(), course.getCourseName()));
        }

        cbCourse.setRenderer(new ComboBoxRenderer());
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MemberScreenMain memberScreenMain = new MemberScreenMain();
        memberScreenMain.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbSemesterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSemesterMouseClicked
        try {
            // TODO add your handling code here:
            DefaultTableModel tableModel = (DefaultTableModel) tbSemester.getModel();
            Vector<Object> courseVector = (Vector<Object>) tableModel.getDataVector().elementAt(tbSemester.getSelectedRow());

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

            Course course = new Course();
            course.setCourseId(Integer.parseInt(courseVector.get(6).toString()));
            course.setCourseName(courseVector.get(5).toString());

            Semester semester = new Semester();
            semester.setCourse(course);
            semester.setSemesterId(Integer.parseInt(courseVector.get(1).toString()));
            semester.setSemesterName(courseVector.get(2).toString());
            semester.setStartTime(simpleDateFormat.parse(courseVector.get(3).toString()));
            semester.setEndTime(simpleDateFormat.parse(courseVector.get(4).toString()));

            txtId.setText(semester.getSemesterId().toString());
            txtSemesterName.setText(semester.getSemesterName());
            dcStartTime.setDate(semester.getStartTime());
            dcEndTime.setDate(semester.getEndTime());

            DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) cbCourse.getModel();
            for (int i = 0; i < comboBoxModel.getSize(); i++) {
                ItemComboBox itemComboBoxSelected = (ItemComboBox) comboBoxModel.getElementAt(i);
                if (itemComboBoxSelected.getId() == course.getCourseId()) {
                    comboBoxModel.setSelectedItem(itemComboBoxSelected);
                }
            }

        } catch (NumberFormatException | ParseException ex) {
            Logger.getLogger(SemestersManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbSemesterMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        this.dispose();
        AddSemesterFrame addSemesterFrame = new AddSemesterFrame();
        addSemesterFrame.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (txtId.getText().trim().compareTo("") == 0) {
            return;
        }

        int responseConfirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn xóa không?", "Xóa kỳ học", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (responseConfirm == JOptionPane.YES_OPTION) {
            if (!semesterService.deleteSemester(Integer.parseInt(txtId.getText()))) {
                JOptionPane.showConfirmDialog(null, "Xóa kỳ học thất bại", "Xóa kỳ học", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                return;
            }
            JOptionPane.showConfirmDialog(null, "Xóa kỳ học thành công", "Xóa kỳ học", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            DefaultTableModel model = (DefaultTableModel) tbSemester.getModel();
            model.setRowCount(0);
            formWindowOpened(null);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if (txtId.getText().trim().compareTo("") == 0) {
            return;
        }

        if (txtSemesterName.getText().trim().compareTo("") == 0) {
            JOptionPane.showConfirmDialog(null, "Tên kỳ học không được để trống", "Lỗi thêm mới", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!dcStartTime.getDate().before(dcEndTime.getDate())) {
            JOptionPane.showConfirmDialog(null, "Ngày bắt đầu và ngày kết thúc không hợp lệ", "Lỗi thêm mới", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            return;
        }

        ItemComboBox itemComboBox = (ItemComboBox) cbCourse.getSelectedItem();

        Course course = new Course(itemComboBox.getId(), itemComboBox.getContent(), null, null);

        Semester semester = new Semester();
        semester.setCourse(course);
        semester.setSemesterId(Integer.parseInt(txtId.getText()));
        semester.setSemesterName(txtSemesterName.getText());
        semester.setStartTime(dcStartTime.getDate());
        semester.setEndTime(dcEndTime.getDate());

        if (!semesterService.updateSemester(semester)) {
            JOptionPane.showConfirmDialog(null, "Sửa kỳ học thất bại", "Sửa khóa học", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showConfirmDialog(null, "Sửa kỳ học thành công", "Sửa khóa học", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

        DefaultTableModel model = (DefaultTableModel) tbSemester.getModel();
        model.setRowCount(0);
        cbCourse.removeAllItems();
        formWindowOpened(null);

    }//GEN-LAST:event_btnEditActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtSearch.getText().trim().compareTo("") == 0) {
                DefaultTableModel model = (DefaultTableModel) tbSemester.getModel();
                model.setRowCount(0);

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

                List<Semester> semesters = semesterService.getAllSemesters();

                for (int i = 0; i < semesters.size(); i++) {
                    Semester semester = semesters.get(i);
                    model.addRow(new Object[]{i + 1, semester.getSemesterId(), semester.getSemesterName(),
                        simpleDateFormat.format(semester.getStartTime()), simpleDateFormat.format(semester.getEndTime()),
                        semester.getCourse().getCourseName(), semester.getCourse().getCourseId()});
                }
            } else {
                DefaultTableModel model = (DefaultTableModel) tbSemester.getModel();
                model.setRowCount(0);

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

                List<Semester> semesters = semesterService.getSemestersLikeCourseName(txtSearch.getText());

                for (int i = 0; i < semesters.size(); i++) {
                    Semester semester = semesters.get(i);
                    model.addRow(new Object[]{i + 1, semester.getSemesterId(), semester.getSemesterName(),
                        simpleDateFormat.format(semester.getStartTime()), simpleDateFormat.format(semester.getEndTime()),
                        semester.getCourse().getCourseName(), semester.getCourse().getCourseId()});
                }
            }
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SemestersManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SemestersManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SemestersManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SemestersManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SemestersManagement().setVisible(true);
            }
        });
    }

    private CourseService courseService = new CourseService();
    private SemesterService semesterService = new SemesterService();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> cbCourse;
    private com.toedter.calendar.JDateChooser dcEndTime;
    private com.toedter.calendar.JDateChooser dcStartTime;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbSemester;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSemesterName;
    // End of variables declaration//GEN-END:variables
}
