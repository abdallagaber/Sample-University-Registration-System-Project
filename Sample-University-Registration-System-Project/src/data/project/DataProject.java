
package data.project;


import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class DataProject extends javax.swing.JFrame {

  
    Connect c =new Connect();
    Connection con = c.connectSql();
    PreparedStatement pst;
    String[] details_of_payment = new String[6];
    double[] GPA = new double[10];
    static String[][] Courses = new String[11][5];
    public DataProject() {
        initComponents();
        tableUpdate();
    }
        
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txtlastname = new javax.swing.JTextField();
        txtfirstname = new javax.swing.JTextField();
        txtmiddlename = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtDepartment = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        cboNationality = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        cboGender = new javax.swing.JComboBox<>();
        txtHouseNum = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtStreetName = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtAreaName = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtCityName = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtGovernorateName = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtPostalCode = new javax.swing.JTextField();
        jComboBox = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtHomePhone = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        cboYear = new javax.swing.JComboBox<>();
        cboTerm = new javax.swing.JComboBox<>();
        cboBirthYear = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        cboFaculity = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        ageValue = new javax.swing.JLabel();
        txtFlatNum = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        txtSearchByStudentID = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        butExit = new javax.swing.JButton();
        butAddNew = new javax.swing.JButton();
        butUpdate = new javax.swing.JButton();
        butDelete = new javax.swing.JButton();
        butReset = new javax.swing.JButton();
        butRefresh = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        number_of_payments = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();
        type_of_funding = new javax.swing.JComboBox<>();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        dot_month = new javax.swing.JComboBox<>();
        dot_year = new javax.swing.JComboBox<>();
        dot_day = new javax.swing.JComboBox<>();
        jLabel55 = new javax.swing.JLabel();
        total_amount_paid = new javax.swing.JTextField();
        current_hours = new javax.swing.JTextField();
        bank_of_transaction = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        amount_paid = new javax.swing.JTextField();
        gpa_sem1 = new javax.swing.JTextField();
        finished_hours = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        maximum_hours = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        gpa_sem2 = new javax.swing.JTextField();
        gpa_sem3 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        gpa_sem4 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        gpa_sem6 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        gpa_sem7 = new javax.swing.JTextField();
        gpa_sem8 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        gpa_sem9 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        gpa_sem5 = new javax.swing.JTextField();
        gpa_sem10 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        remaining_hours = new javax.swing.JLabel();
        num_of_sem = new javax.swing.JLabel();
        transaction_number = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        txtNumberOfFinishedCourses = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        txtTotalNumberOfCreditHoursFinished = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        cboFinishedCourses = new javax.swing.JComboBox<>();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cboInYear = new javax.swing.JComboBox<>();
        cboFinishedInSemester = new javax.swing.JComboBox<>();
        txtCourseCreditHoursFinished = new javax.swing.JTextField();
        txtCourseLabTutorNameFinished = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        txtCourseCodeFinished = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        txtCourseTurorNameFinished = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        txtCoursePercentage = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        txtFinalExamMark = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        txtTotalNumberOfCreditHoursCurrent = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        cboCurrentCourses = new javax.swing.JComboBox<>();
        jLabel92 = new javax.swing.JLabel();
        txtCousreCodeCurrent = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        txtCourseCreditHoursCurrent = new javax.swing.JTextField();
        cboNumberOfTimeTakingCourse = new javax.swing.JComboBox<>();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        txtCourseTutorNameCurrent = new javax.swing.JTextField();
        txtCourseLabTutorNameCurrent = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        txtCourseGrade = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        courseGrade = new javax.swing.JLabel();
        CoursePercentage = new javax.swing.JLabel();
        txtNumberOfCurrentCourses = new javax.swing.JTextField();
        txt7thMark = new javax.swing.JTextField();
        txt12thMark = new javax.swing.JTextField();
        txtYearWorkMark = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel24.setText("Student Name:");
        jLabel24.setToolTipText("");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 20));

        txtlastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtlastnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtlastnameFocusLost(evt);
            }
        });
        txtlastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlastnameActionPerformed(evt);
            }
        });
        jPanel5.add(txtlastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 80, -1));

        txtfirstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfirstnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfirstnameFocusLost(evt);
            }
        });
        txtfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfirstnameActionPerformed(evt);
            }
        });
        jPanel5.add(txtfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 80, -1));

        txtmiddlename.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                txtmiddlenameAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtmiddlename.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtmiddlenameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmiddlenameFocusLost(evt);
            }
        });
        jPanel5.add(txtmiddlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 80, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel25.setText("Term:");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 100, 20));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel26.setText("Year:");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, 20));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel27.setText("Department:");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        txtDepartment.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDepartmentFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDepartmentFocusLost(evt);
            }
        });
        txtDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartmentActionPerformed(evt);
            }
        });
        jPanel5.add(txtDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 230, 30));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel28.setText("Nationality:");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 130, -1));

        cboNationality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afghan", "Albanian", "Algerian", "Argentine", "Australian", "Austrian", "American", "Bangladeshi", "Belgian", "Bolivian", "Batswana", "Brazilian", "Bulgarian", "Cambodian", "Cameroonian", "Canadian", "Chilean", "Chinese", "Colombian", "Costa Rican", "Croatian", "Cuban", "Czech", "Danish", "Dominican", "Ecuadorian", "Egyptian", "Salvadorian", "English", "Estonian", "Ethiopian", "Fijian", "Finnish", "French", "German", "Ghanaian", "Greek", "Guatemalan", "Haitian", "Honduran", "Hungarian", "Icelandic", "Indian", "Indonesian", "Iranian", "Iraqi", "Irish", "Israeli", "Italian", "Jamaican", "Japanese", "Jordanian", "Kenyan", "Kuwaiti", "Lao", "Latvian", "Lebanese", "Libyan", "Lithuanian", "Malagasy", "Malaysian", "Malian", "Maltese", "Mexican", "Mongolian", "Moroccan", "Mozambican", "Namibian", "Nepalese", "Dutch", "New Zealand", "Nicaraguan", "Nigerian", "Norwegian", "Pakistani", "Panamanian", "Paraguayan", "Peruvian", "Philippine", "Polish", "Portuguese", "Romanian", "Russian", "Saudi", "Scottish", "Senegalese", "Serbian", "Singaporean", "Slovak", "South African", "Korean", "Spanish", "Sri Lankan", "Sudanese", "Swedish", "Swiss", "Syrian", "Taiwanese", "Tajikistani", "Thai", "Tongan", "Tunisian", "Turkish", "Ukrainian", "Emirati", "British", "Uruguayan", "Venezuelan", "Vietnamese", "Welsh", "Zambian", "Zimbabwean" }));
        cboNationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNationalityActionPerformed(evt);
            }
        });
        jPanel5.add(cboNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 210, 30));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel29.setText("House Number:");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel30.setText("Flat Number:");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel31.setText("Gender:");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        cboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cboGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGenderActionPerformed(evt);
            }
        });
        jPanel5.add(cboGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        txtHouseNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHouseNumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHouseNumFocusLost(evt);
            }
        });
        txtHouseNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHouseNumKeyTyped(evt);
            }
        });
        jPanel5.add(txtHouseNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 200, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel32.setText("Street Name:");
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        txtStreetName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStreetNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtStreetNameFocusLost(evt);
            }
        });
        txtStreetName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStreetNameActionPerformed(evt);
            }
        });
        jPanel5.add(txtStreetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 230, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel33.setText("Area/Distric Name:");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        txtAreaName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAreaNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAreaNameFocusLost(evt);
            }
        });
        txtAreaName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaNameActionPerformed(evt);
            }
        });
        jPanel5.add(txtAreaName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 170, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel34.setText("City Name:");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        txtCityName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCityNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCityNameFocusLost(evt);
            }
        });
        txtCityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityNameActionPerformed(evt);
            }
        });
        jPanel5.add(txtCityName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 70, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel35.setText("Governorate Name:");
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, -1, -1));

        txtGovernorateName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtGovernorateNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGovernorateNameFocusLost(evt);
            }
        });
        jPanel5.add(txtGovernorateName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, 150, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel36.setText("Country:");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, -1, -1));

        txtCountry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCountryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCountryFocusLost(evt);
            }
        });
        txtCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountryActionPerformed(evt);
            }
        });
        jPanel5.add(txtCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, 80, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel38.setText("Postal Code:");
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, -1, -1));

        txtPostalCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPostalCodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPostalCodeFocusLost(evt);
            }
        });
        txtPostalCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPostalCodeActionPerformed(evt);
            }
        });
        txtPostalCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPostalCodeKeyTyped(evt);
            }
        });
        jPanel5.add(txtPostalCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 650, 230, -1));

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 700, 70, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel39.setText("Email:");
        jPanel5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 770, -1, -1));

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        jPanel5.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 770, 300, 30));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jPanel5.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 790, -1, -1));

        txtHomePhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHomePhoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHomePhoneFocusLost(evt);
            }
        });
        txtHomePhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHomePhoneKeyTyped(evt);
            }
        });
        jPanel5.add(txtHomePhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 810, 210, 30));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel41.setText("Mobile :");
        jPanel5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 850, -1, -1));

        txtMobile.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMobileFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMobileFocusLost(evt);
            }
        });
        txtMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileActionPerformed(evt);
            }
        });
        txtMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMobileKeyTyped(evt);
            }
        });
        jPanel5.add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 860, 280, 30));
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel42.setText("Student Information");
        jPanel7.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, 40));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 40));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel43.setText("ID:");
        jPanel5.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIDFocusLost(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });
        jPanel5.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 220, -1));

        cboYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022" }));
        jPanel5.add(cboYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 90, -1));

        cboTerm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        jPanel5.add(cboTerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 90, -1));

        cboBirthYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));
        cboBirthYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBirthYearActionPerformed(evt);
            }
        });
        jPanel5.add(cboBirthYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 700, -1, -1));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel44.setText("Faculty:");
        jLabel44.setToolTipText("");
        jPanel5.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        cboFaculity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Faculty of Agriculture", "Faculty of Medicine", "Faculty of Fine Arts", "Faculty of Commerce", "Faculty of Engineering", "Faculty of Law", "Faculty of Science", "Faculty of Computer and Data Science" }));
        jPanel5.add(cboFaculity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 210, -1));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel45.setText("Home Phone:");
        jPanel5.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 810, -1, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel46.setText("BirthDay Date:");
        jPanel5.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 690, -1, -1));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel48.setText("Age:");
        jPanel5.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 730, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 700, 60, -1));

        ageValue.setBackground(new java.awt.Color(255, 255, 255));
        ageValue.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        ageValue.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel5.add(ageValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 730, 60, 30));

        txtFlatNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFlatNumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFlatNumFocusLost(evt);
            }
        });
        txtFlatNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlatNumActionPerformed(evt);
            }
        });
        txtFlatNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFlatNumKeyTyped(evt);
            }
        });
        jPanel5.add(txtFlatNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 60, -1));

        jPanel8.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 430, 900));

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel47.setText("Search By Student ID:");
        jPanel10.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, -1));

        txtSearchByStudentID.setText(" ");
        txtSearchByStudentID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchByStudentIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchByStudentIDFocusLost(evt);
            }
        });
        txtSearchByStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchByStudentIDActionPerformed(evt);
            }
        });
        txtSearchByStudentID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchByStudentIDKeyPressed(evt);
            }
        });
        jPanel10.add(txtSearchByStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 42, 340, 30));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Student Id", "First Name", "Middle Name", "Last Name", "Year", "Term", "Faculty", "Department", "Nationality", "Gender", "Flat Number", "House Number", "Street", "Area", "City", "Country", "Governorate", "Postal Code", "DOB_Day", "DOB_Month", "DOB_Year", "Age", "E-mail", "Home Phone", "Mobile", "Type of funding", "Number of payments", "Total amount paid", "Amount paid", "Transaction number", "Bank of transaction", "dot_day", "dot_month", "dot_year", "Maximum hours", "Finished hours", "Current hours", "Remaining hours", "gpa_sem1", "gpa_sem2", "gpa_sem3", "gpa_sem4", "gpa_sem5", "gpa_sem6", "gpa_sem7", "gpa_sem8", "gpa_sem9", "gpa_sem10", " Number of semesters", "cum_finished_courses", "total_credit_hour_finished", "finished_course", "course_code", "F_course_credit_hour", "Finished_in_semester", "Finished_in_year", "Fcourse_Tutor_name", "Fcourse_lab_tutor_name", "Finished_course_grade", "Finished_Course_perecentage", "Num_current_courses", "total_credit_hour_current", "current_course", "Ccourse_code", "Ccourse_credit_hour", "time_taking_the_course", "Ccurrent_course_tutor_name", "Ccurrent_course_lab_tutor_name", "7th Mark", "12th Mark", "Year_work_mark", "Final_exam_mark", "Ccourse_grade", "Ccourse_percentage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jPanel10.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1490, 270));

        butExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        butExit.setText("Exit");
        butExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExitActionPerformed(evt);
            }
        });
        jPanel10.add(butExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 380, 170, 50));

        butAddNew.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        butAddNew.setText("ADD NEW");
        butAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAddNewActionPerformed(evt);
            }
        });
        jPanel10.add(butAddNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 170, 50));

        butUpdate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        butUpdate.setText("Update");
        butUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butUpdateActionPerformed(evt);
            }
        });
        jPanel10.add(butUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 170, 50));

        butDelete.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        butDelete.setText("Delete");
        butDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeleteActionPerformed(evt);
            }
        });
        jPanel10.add(butDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 380, 170, 50));

        butReset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        butReset.setText("Reset");
        butReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butResetActionPerformed(evt);
            }
        });
        jPanel10.add(butReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 170, 50));

        butRefresh.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        butRefresh.setText("Refresh");
        butRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRefreshActionPerformed(evt);
            }
        });
        jPanel10.add(butRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 170, 50));

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 910, 1520, 450));

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel37.setText("The details of the payment");
        jLabel37.setToolTipText("");
        jLabel37.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 40));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jPanel9.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 790, -1, -1));
        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel65.setText("GPA");
        jPanel12.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, 40));

        jPanel9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 400, 40));

        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel71.setText("Payment");
        jPanel13.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, 40));

        jPanel9.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 40));

        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel72.setText("Credit Hours");
        jPanel14.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, 40));

        jPanel9.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 400, 40));

        number_of_payments.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        number_of_payments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_of_paymentsActionPerformed(evt);
            }
        });
        jPanel9.add(number_of_payments, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel49.setText("Date of transaction");
        jLabel49.setToolTipText("");
        jPanel9.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 30));

        type_of_funding.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "self-funded", "grant-funded" }));
        jPanel9.add(type_of_funding, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel50.setText("Number of payments done:");
        jLabel50.setToolTipText("");
        jPanel9.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 30));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel51.setText("Total amount paid so far:");
        jLabel51.setToolTipText("");
        jPanel9.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 30));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel52.setText("Type of funding:");
        jLabel52.setToolTipText("");
        jPanel9.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 30));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel53.setText("Remaining Hours:");
        jLabel53.setToolTipText("");
        jPanel9.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, 30));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel54.setText("Transaction number:");
        jLabel54.setToolTipText("");
        jPanel9.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 30));

        dot_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        dot_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dot_monthActionPerformed(evt);
            }
        });
        jPanel9.add(dot_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 70, -1));

        dot_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));
        dot_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dot_yearActionPerformed(evt);
            }
        });
        jPanel9.add(dot_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        dot_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dot_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dot_dayActionPerformed(evt);
            }
        });
        jPanel9.add(dot_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 60, -1));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel55.setText("Bank of transaction:");
        jLabel55.setToolTipText("");
        jPanel9.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 30));

        total_amount_paid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                total_amount_paidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                total_amount_paidFocusLost(evt);
            }
        });
        total_amount_paid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_amount_paidActionPerformed(evt);
            }
        });
        total_amount_paid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                total_amount_paidKeyTyped(evt);
            }
        });
        jPanel9.add(total_amount_paid, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 70, -1));

        current_hours.setText("0");
        current_hours.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                current_hoursFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                current_hoursFocusLost(evt);
            }
        });
        current_hours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                current_hoursActionPerformed(evt);
            }
        });
        current_hours.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                current_hoursKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                current_hoursKeyTyped(evt);
            }
        });
        jPanel9.add(current_hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 90, -1));

        bank_of_transaction.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bank_of_transactionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bank_of_transactionFocusLost(evt);
            }
        });
        bank_of_transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bank_of_transactionActionPerformed(evt);
            }
        });
        bank_of_transaction.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bank_of_transactionKeyTyped(evt);
            }
        });
        jPanel9.add(bank_of_transaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 150, -1));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel56.setText("Amount paid:");
        jLabel56.setToolTipText("");
        jPanel9.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 30));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel57.setText("Number of semesters finished");
        jLabel57.setToolTipText("");
        jPanel9.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 770, -1, 30));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel58.setText("Finished Hours:");
        jLabel58.setToolTipText("");
        jPanel9.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, 30));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel59.setText("Current Hours:");
        jLabel59.setToolTipText("");
        jPanel9.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, 30));

        amount_paid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                amount_paidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                amount_paidFocusLost(evt);
            }
        });
        amount_paid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount_paidActionPerformed(evt);
            }
        });
        amount_paid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amount_paidKeyTyped(evt);
            }
        });
        jPanel9.add(amount_paid, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 90, -1));

        gpa_sem1.setText("0");
        gpa_sem1.setToolTipText("");
        gpa_sem1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gpa_sem1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gpa_sem1FocusLost(evt);
            }
        });
        gpa_sem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpa_sem1ActionPerformed(evt);
            }
        });
        gpa_sem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gpa_sem1KeyTyped(evt);
            }
        });
        jPanel9.add(gpa_sem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 562, 70, 30));

        finished_hours.setText("0");
        finished_hours.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                finished_hoursFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                finished_hoursFocusLost(evt);
            }
        });
        finished_hours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finished_hoursActionPerformed(evt);
            }
        });
        finished_hours.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                finished_hoursKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                finished_hoursKeyTyped(evt);
            }
        });
        jPanel9.add(finished_hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 90, -1));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel60.setText("Maximum Hours:");
        jLabel60.setToolTipText("");
        jPanel9.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 30));

        maximum_hours.setText("0");
        maximum_hours.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                maximum_hoursFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                maximum_hoursFocusLost(evt);
            }
        });
        maximum_hours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maximum_hoursActionPerformed(evt);
            }
        });
        maximum_hours.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                maximum_hoursKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                maximum_hoursKeyTyped(evt);
            }
        });
        jPanel9.add(maximum_hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 90, -1));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel61.setText("semester 2:");
        jLabel61.setToolTipText("");
        jPanel9.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, 30));

        gpa_sem2.setText("0");
        gpa_sem2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gpa_sem2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gpa_sem2FocusLost(evt);
            }
        });
        gpa_sem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpa_sem2ActionPerformed(evt);
            }
        });
        gpa_sem2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gpa_sem2KeyTyped(evt);
            }
        });
        jPanel9.add(gpa_sem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 70, 30));

        gpa_sem3.setText("0");
        gpa_sem3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gpa_sem3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gpa_sem3FocusLost(evt);
            }
        });
        gpa_sem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpa_sem3ActionPerformed(evt);
            }
        });
        gpa_sem3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gpa_sem3KeyTyped(evt);
            }
        });
        jPanel9.add(gpa_sem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 640, 70, 30));

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel62.setText("semester 3:");
        jLabel62.setToolTipText("");
        jPanel9.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, -1, 30));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel64.setText("semester 4:");
        jLabel64.setToolTipText("");
        jPanel9.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, -1, 30));

        gpa_sem4.setText("0");
        gpa_sem4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gpa_sem4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gpa_sem4FocusLost(evt);
            }
        });
        gpa_sem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpa_sem4ActionPerformed(evt);
            }
        });
        gpa_sem4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gpa_sem4KeyTyped(evt);
            }
        });
        jPanel9.add(gpa_sem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 680, 70, 30));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel66.setText("semester 6:");
        jLabel66.setToolTipText("");
        jPanel9.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, -1, 30));

        gpa_sem6.setText("0");
        gpa_sem6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gpa_sem6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gpa_sem6FocusLost(evt);
            }
        });
        gpa_sem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpa_sem6ActionPerformed(evt);
            }
        });
        gpa_sem6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gpa_sem6KeyTyped(evt);
            }
        });
        jPanel9.add(gpa_sem6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, 70, 30));

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel67.setText("semester 7:");
        jLabel67.setToolTipText("");
        jPanel9.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 600, -1, 30));

        gpa_sem7.setText("0");
        gpa_sem7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gpa_sem7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gpa_sem7FocusLost(evt);
            }
        });
        gpa_sem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpa_sem7ActionPerformed(evt);
            }
        });
        gpa_sem7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gpa_sem7KeyTyped(evt);
            }
        });
        jPanel9.add(gpa_sem7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, 70, 30));

        gpa_sem8.setText("0");
        gpa_sem8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gpa_sem8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gpa_sem8FocusLost(evt);
            }
        });
        gpa_sem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpa_sem8ActionPerformed(evt);
            }
        });
        gpa_sem8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gpa_sem8KeyTyped(evt);
            }
        });
        jPanel9.add(gpa_sem8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 640, 70, 30));

        jLabel69.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel69.setText("semester 9:");
        jLabel69.setToolTipText("");
        jPanel9.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 680, -1, 30));

        gpa_sem9.setText("0");
        gpa_sem9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gpa_sem9FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gpa_sem9FocusLost(evt);
            }
        });
        gpa_sem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpa_sem9ActionPerformed(evt);
            }
        });
        gpa_sem9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gpa_sem9KeyTyped(evt);
            }
        });
        jPanel9.add(gpa_sem9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 680, 70, 30));

        jLabel70.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel70.setText("semester 8:");
        jLabel70.setToolTipText("");
        jPanel9.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 640, -1, 30));

        jLabel73.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel73.setText("semester 5:");
        jLabel73.setToolTipText("");
        jPanel9.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, -1, 30));

        gpa_sem5.setText("0");
        gpa_sem5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gpa_sem5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gpa_sem5FocusLost(evt);
            }
        });
        gpa_sem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpa_sem5ActionPerformed(evt);
            }
        });
        gpa_sem5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gpa_sem5KeyTyped(evt);
            }
        });
        jPanel9.add(gpa_sem5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 720, 70, 30));

        gpa_sem10.setText("0");
        gpa_sem10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gpa_sem10FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gpa_sem10FocusLost(evt);
            }
        });
        gpa_sem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpa_sem10ActionPerformed(evt);
            }
        });
        gpa_sem10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gpa_sem10KeyTyped(evt);
            }
        });
        jPanel9.add(gpa_sem10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 720, 70, 30));

        jLabel74.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel74.setText("semester 10:");
        jLabel74.setToolTipText("");
        jPanel9.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 720, -1, 30));

        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel68.setText("semester 1:");
        jLabel68.setToolTipText("");
        jPanel9.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, 30));

        remaining_hours.setBackground(new java.awt.Color(255, 255, 255));
        remaining_hours.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        remaining_hours.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel9.add(remaining_hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 60, 30));

        num_of_sem.setBackground(new java.awt.Color(255, 255, 255));
        num_of_sem.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        num_of_sem.setText("0");
        num_of_sem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel9.add(num_of_sem, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 810, 60, 30));

        transaction_number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                transaction_numberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                transaction_numberFocusLost(evt);
            }
        });
        transaction_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaction_numberActionPerformed(evt);
            }
        });
        transaction_number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                transaction_numberKeyTyped(evt);
            }
        });
        jPanel9.add(transaction_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 90, -1));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 430, 900));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel76.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel76.setText("Finished Courses");
        jPanel15.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, 40));

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, 40));

        jLabel75.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel75.setText("Number of finished courses:");
        jLabel75.setToolTipText("");
        jPanel1.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 40));
        jPanel1.add(txtNumberOfFinishedCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 100, -1));

        jLabel77.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel77.setText("Total number of credit hours for these courses:");
        jLabel77.setToolTipText("");
        jPanel1.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 30));
        jPanel1.add(txtTotalNumberOfCreditHoursFinished, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 80, 30));

        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel78.setText("             The details of current Course");
        jLabel78.setToolTipText("");
        jLabel78.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 520, 40));

        jLabel79.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel79.setText("Choose the Course:");
        jLabel79.setToolTipText("");
        jPanel1.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        cboFinishedCourses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Data Science", "Programming 1", "Calculus", "Linear Algebra", "Introduction to computer Scince" }));
        cboFinishedCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboFinishedCoursesActionPerformed(evt);
            }
        });
        jPanel1.add(cboFinishedCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 190, 30));

        jLabel80.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel80.setText("Finished in Semester:");
        jLabel80.setToolTipText("");
        jPanel1.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 40));

        jLabel81.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel81.setText("Course lab tutor Name:");
        jLabel81.setToolTipText("");
        jPanel1.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 40));

        jLabel82.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel82.setText("Course credit hours:");
        jLabel82.setToolTipText("");
        jPanel1.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("in Year:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, 40));

        cboInYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022" }));
        jPanel1.add(cboInYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 80, 20));

        cboFinishedInSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(cboFinishedInSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 80, 20));
        jPanel1.add(txtCourseCreditHoursFinished, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 190, -1));
        jPanel1.add(txtCourseLabTutorNameFinished, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 130, -1));

        jLabel83.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel83.setText("Course Code:");
        jLabel83.setToolTipText("");
        jPanel1.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 40));
        jPanel1.add(txtCourseCodeFinished, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 190, -1));

        jLabel84.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel84.setText("Course Percentage:");
        jLabel84.setToolTipText("");
        jPanel1.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, 40));

        txtCourseTurorNameFinished.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseTurorNameFinishedActionPerformed(evt);
            }
        });
        jPanel1.add(txtCourseTurorNameFinished, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 130, -1));

        jLabel85.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel85.setText("Course tutor Name:");
        jLabel85.setToolTipText("");
        jPanel1.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, 40));

        jLabel86.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel86.setText("Course Grade:");
        jLabel86.setToolTipText("");
        jPanel1.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 840, -1, 30));
        jPanel1.add(txtCoursePercentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 70, -1));

        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel87.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel87.setText("Current Courses");
        jPanel16.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, 40));

        jPanel1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 620, 40));

        jLabel88.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel88.setText("Number of current courses :");
        jLabel88.setToolTipText("");
        jPanel1.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, 40));

        txtFinalExamMark.setText("0");
        txtFinalExamMark.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFinalExamMarkFocusLost(evt);
            }
        });
        jPanel1.add(txtFinalExamMark, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 800, 100, -1));

        jLabel89.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel89.setText("Total number of credit hours for these courses:");
        jLabel89.setToolTipText("");
        jPanel1.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, 30));

        txtTotalNumberOfCreditHoursCurrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalNumberOfCreditHoursCurrentActionPerformed(evt);
            }
        });
        jPanel1.add(txtTotalNumberOfCreditHoursCurrent, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 80, 30));

        jLabel90.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel90.setText("             The details of finished Course");
        jLabel90.setToolTipText("");
        jLabel90.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 520, 40));

        jLabel91.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel91.setText("Choose the Course:");
        jLabel91.setToolTipText("");
        jPanel1.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, 30));

        cboCurrentCourses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Advanced Calculus", "Data Structures", "Discrete Mathematics", "Innovation", "Probability", "Programming 2" }));
        cboCurrentCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCurrentCoursesActionPerformed(evt);
            }
        });
        jPanel1.add(cboCurrentCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 190, 30));

        jLabel92.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel92.setText("Course Code:");
        jLabel92.setToolTipText("");
        jPanel1.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, 40));
        jPanel1.add(txtCousreCodeCurrent, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 610, 190, -1));

        jLabel93.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel93.setText("Number of time taking the course:");
        jLabel93.setToolTipText("");
        jPanel1.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, -1, 30));

        jLabel94.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel94.setText("Course credit hours:");
        jLabel94.setToolTipText("");
        jPanel1.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, -1, 50));
        jPanel1.add(txtCourseCreditHoursCurrent, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 650, 190, -1));

        cboNumberOfTimeTakingCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Time", "Second Time" }));
        jPanel1.add(cboNumberOfTimeTakingCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 690, 110, -1));

        jLabel95.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel95.setText("Course tutor Name:");
        jLabel95.setToolTipText("");
        jPanel1.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, -1, 40));

        jLabel96.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel96.setText("Course lab tutor Name:");
        jLabel96.setToolTipText("");
        jPanel1.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 750, -1, 40));
        jPanel1.add(txtCourseTutorNameCurrent, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 720, 130, -1));
        jPanel1.add(txtCourseLabTutorNameCurrent, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 760, 130, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("Final exam mark:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 790, -1, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("7 th mark:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 717, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setText("12 th mark:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 750, -1, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setText("Year work mark:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 790, -1, 40));

        jLabel97.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel97.setText("Course Grade:");
        jLabel97.setToolTipText("");
        jPanel1.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, 40));
        jPanel1.add(txtCourseGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 100, -1));

        jLabel98.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel98.setText("Course Percentage:");
        jLabel98.setToolTipText("");
        jPanel1.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 840, -1, 30));

        courseGrade.setBackground(new java.awt.Color(255, 255, 255));
        courseGrade.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        courseGrade.setText("0");
        courseGrade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel1.add(courseGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 840, 60, 30));

        CoursePercentage.setBackground(new java.awt.Color(255, 255, 255));
        CoursePercentage.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        CoursePercentage.setText("0");
        CoursePercentage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel1.add(CoursePercentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 840, 50, 30));
        jPanel1.add(txtNumberOfCurrentCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 100, -1));

        txt7thMark.setText("0");
        txt7thMark.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt7thMarkFocusLost(evt);
            }
        });
        txt7thMark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt7thMarkActionPerformed(evt);
            }
        });
        jPanel1.add(txt7thMark, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 720, 100, -1));

        txt12thMark.setText("0");
        txt12thMark.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt12thMarkFocusLost(evt);
            }
        });
        jPanel1.add(txt12thMark, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 760, 100, -1));

        txtYearWorkMark.setText("0");
        txtYearWorkMark.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtYearWorkMarkFocusLost(evt);
            }
        });
        jPanel1.add(txtYearWorkMark, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 800, 100, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setText("%");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 840, 30, 30));

        jPanel8.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 640, 900));

        jScrollPane4.setViewportView(jPanel8);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtlastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtlastnameFocusGained
    }//GEN-LAST:event_txtlastnameFocusGained

    private void txtlastnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtlastnameFocusLost
    }//GEN-LAST:event_txtlastnameFocusLost

    private void txtfirstnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfirstnameFocusGained
       
    }//GEN-LAST:event_txtfirstnameFocusGained

    private void txtfirstnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfirstnameFocusLost
        
    }//GEN-LAST:event_txtfirstnameFocusLost

    private void txtfirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfirstnameActionPerformed

    private void txtmiddlenameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmiddlenameFocusGained
    }//GEN-LAST:event_txtmiddlenameFocusGained

    private void txtmiddlenameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmiddlenameFocusLost
    }//GEN-LAST:event_txtmiddlenameFocusLost

    private void txtDepartmentFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDepartmentFocusGained
    }//GEN-LAST:event_txtDepartmentFocusGained

    private void txtDepartmentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDepartmentFocusLost
    }//GEN-LAST:event_txtDepartmentFocusLost

    private void txtDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartmentActionPerformed

    private void cboNationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboNationalityActionPerformed

    private void txtFlatNumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFlatNumFocusGained
    }//GEN-LAST:event_txtFlatNumFocusGained

    private void txtFlatNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFlatNumFocusLost
    }//GEN-LAST:event_txtFlatNumFocusLost

    private void txtFlatNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlatNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlatNumActionPerformed

    private void txtFlatNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFlatNumKeyTyped
        
    }//GEN-LAST:event_txtFlatNumKeyTyped

    private void cboGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboGenderActionPerformed

    private void txtHouseNumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHouseNumFocusGained
    }//GEN-LAST:event_txtHouseNumFocusGained

    private void txtHouseNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHouseNumFocusLost
    }//GEN-LAST:event_txtHouseNumFocusLost

    private void txtHouseNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHouseNumKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHouseNumKeyTyped

    private void txtStreetNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStreetNameFocusGained
    }//GEN-LAST:event_txtStreetNameFocusGained

    private void txtStreetNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStreetNameFocusLost
    }//GEN-LAST:event_txtStreetNameFocusLost

    private void txtAreaNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAreaNameFocusGained
        
    }//GEN-LAST:event_txtAreaNameFocusGained

    private void txtAreaNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAreaNameFocusLost
        
    }//GEN-LAST:event_txtAreaNameFocusLost

    private void txtAreaNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaNameActionPerformed

    private void txtCityNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCityNameFocusGained
        
    }//GEN-LAST:event_txtCityNameFocusGained

    private void txtCityNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCityNameFocusLost
       
    }//GEN-LAST:event_txtCityNameFocusLost

    private void txtCityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityNameActionPerformed

    private void txtGovernorateNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGovernorateNameFocusGained
        
    }//GEN-LAST:event_txtGovernorateNameFocusGained

    private void txtGovernorateNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGovernorateNameFocusLost
         
    }//GEN-LAST:event_txtGovernorateNameFocusLost

    private void txtCountryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCountryFocusGained
        
    }//GEN-LAST:event_txtCountryFocusGained

    private void txtCountryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCountryFocusLost
        
    }//GEN-LAST:event_txtCountryFocusLost

    private void txtCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountryActionPerformed

    private void txtPostalCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPostalCodeFocusGained
        
    }//GEN-LAST:event_txtPostalCodeFocusGained

    private void txtPostalCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPostalCodeFocusLost
       
    }//GEN-LAST:event_txtPostalCodeFocusLost

    private void txtPostalCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPostalCodeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPostalCodeKeyTyped

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
       
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtHomePhoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHomePhoneFocusGained
        
    }//GEN-LAST:event_txtHomePhoneFocusGained

    private void txtHomePhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHomePhoneFocusLost
        
    }//GEN-LAST:event_txtHomePhoneFocusLost

    private void txtHomePhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHomePhoneKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHomePhoneKeyTyped

    private void txtMobileFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMobileFocusGained
        
    }//GEN-LAST:event_txtMobileFocusGained

    private void txtMobileFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMobileFocusLost
       
    }//GEN-LAST:event_txtMobileFocusLost

    private void txtMobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileKeyTyped

    private void txtIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusGained
        
    }//GEN-LAST:event_txtIDFocusGained

    private void txtIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusLost
       
    }//GEN-LAST:event_txtIDFocusLost

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtSearchByStudentIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchByStudentIDFocusGained
        
    }//GEN-LAST:event_txtSearchByStudentIDFocusGained

    private void txtSearchByStudentIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchByStudentIDFocusLost
       
    }//GEN-LAST:event_txtSearchByStudentIDFocusLost

    private void txtlastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlastnameActionPerformed

    private void txtPostalCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPostalCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPostalCodeActionPerformed
        private JFrame ExitFrame;
    private void butExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExitActionPerformed
        ExitFrame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(ExitFrame,"Confirm if you want to Exit","",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){System.exit(0);}
    }//GEN-LAST:event_butExitActionPerformed

    private void butDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeleteActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel)table.getModel();
       int SelectedRows = table.getSelectedRow();
       try{
       int id = Integer.parseInt(RecordTable.getValueAt(SelectedRows,0).toString());
       int deleteItem = JOptionPane.showConfirmDialog(null, "Confirm if you want to delete this Student","Warning",JOptionPane.YES_NO_OPTION);
       if(deleteItem == JOptionPane.YES_NO_OPTION){
        
        pst = con.prepareStatement("delete from student where id =?");
        pst.setInt(1,id);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Student Record Updated");
        tableUpdate();
        txtID.setText("");
        txtfirstname.setText("");
        txtmiddlename.setText("");
        txtlastname.setText("");
        cboYear.setSelectedIndex(0);
        cboTerm.setSelectedIndex(0);
        cboFaculity.setSelectedIndex(0);
        txtDepartment.setText("");
        cboNationality.setSelectedIndex(0);
        cboGender.setSelectedIndex(0);
        txtFlatNum.setText("");
        txtHouseNum.setText("");
        txtStreetName.setText("");
        txtAreaName.setText("");
        txtCityName.setText("");
        txtCountry.setText("");
        txtGovernorateName.setText("");
        txtPostalCode.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox.setSelectedIndex(0);
        cboBirthYear.setSelectedIndex(0);
        ageValue.setText("");
        txtEmail.setText("");
        txtHomePhone.setText("");
        txtMobile.setText("");
        type_of_funding.setSelectedIndex(0);
        number_of_payments.setSelectedIndex(0);
        total_amount_paid.setText("");
        amount_paid.setText("");
        transaction_number.setText("");
        bank_of_transaction.setText("");
        dot_day.setSelectedIndex(0);
        dot_month.setSelectedIndex(0);
        dot_year.setSelectedIndex(0);
        maximum_hours.setText("0");
        finished_hours.setText("0");
        current_hours.setText("0");
        remaining_hours.setText("");
        gpa_sem1.setText("0");
        gpa_sem2.setText("0");
        gpa_sem3.setText("0");
        gpa_sem4.setText("0");
        gpa_sem5.setText("0");
        gpa_sem6.setText("0");
        gpa_sem7.setText("0");
        gpa_sem8.setText("0");
        gpa_sem9.setText("0");
        gpa_sem10.setText("0");
        num_of_sem.setText("");
        txtNumberOfFinishedCourses.setText("");
        txtTotalNumberOfCreditHoursFinished.setText("");
        cboFinishedCourses.setSelectedIndex(0);
        txtCourseCodeFinished.setText("");
        txtCourseCreditHoursFinished.setText("");
        cboFinishedInSemester.setSelectedIndex(0);
        cboInYear.setSelectedIndex(0);
        txtCourseTurorNameFinished.setText("");
        txtCourseLabTutorNameFinished.setText("");
        txtCourseGrade.setText("");
        txtCoursePercentage.setText("");
        txtNumberOfCurrentCourses.setText("");
        txtTotalNumberOfCreditHoursCurrent.setText("");
        cboCurrentCourses.setSelectedIndex(0);
        txtCousreCodeCurrent.setText("");
        txtCourseCreditHoursCurrent.setText("");
        cboNumberOfTimeTakingCourse.setSelectedIndex(0);
        txtCourseTutorNameCurrent.setText("");
        txtCourseLabTutorNameCurrent.setText("");
        txt7thMark.setText("0");
        txt12thMark.setText("0");
        txtYearWorkMark.setText("0");
        txtFinalExamMark.setText("0");
        courseGrade.setText("0");
        CoursePercentage.setText("0");
       }
       }catch(SQLException e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_butDeleteActionPerformed

    private void butAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAddNewActionPerformed
        // TODO add your handling code here:
        arrayValue();
        try{
            pst = con.prepareStatement("INSERT INTO student(student_id,first_name,middle_name,last_name,year,term,faculty,department,nationality,gender"
                    + ",flat_number,house_number,street,area,city,country,governorate,postal_code,dob_day, dob_month,dob_year,age,email,home_phone,mobile,"
                    + "type_of_funding,number_of_payments,total_amount_paid,amount_paid,transaction_number,bank_of_transaction,dot_day,dot_month,dot_year,"
                    + "maximum_hours,finished_hours,current_hours,remaining_hours,gpa_sem1,gpa_sem2,gpa_sem3,gpa_sem4,gpa_sem5,gpa_sem6,gpa_sem7,gpa_sem8,"
                    + "gpa_sem9,gpa_sem10,num_of_sem,num_finished_course,total_credit_hour_finished,finished_course,course_code,course_credit_hour,"
                    + "finished_in_semester,finished_in_year,finish_course_tutor_name,finish_lab_course_tutor_name,finished_grade,finished_percentage,"
                    + "num_current_courses,total_credit_hour_current,current_course,current_course_code,current_course_credit_hour,time_taking_the_course,"
                    + "current_course_tutor_name,current_lab_course_tutor_name,7th_mark,12th_mark,current_year_work_mark,current_final_mark,current_course_grade,current_course_percentage)"
                    + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, txtID.getText());
            pst.setString(2, txtfirstname.getText());
            pst.setString(3, txtmiddlename.getText());
            pst.setString(4, txtlastname.getText());
            pst.setString(5, cboYear.getSelectedItem().toString());
            pst.setString(6, cboTerm.getSelectedItem().toString());
            pst.setString(7, cboFaculity.getSelectedItem().toString());
            pst.setString(8, txtDepartment.getText());
            pst.setString(9, cboNationality.getSelectedItem().toString());
            pst.setString(10, cboGender.getSelectedItem().toString());
            pst.setString(11, txtFlatNum.getText());
            pst.setString(12, txtHouseNum.getText());
            pst.setString(13, txtStreetName.getText());
            pst.setString(14, txtAreaName.getText());
            pst.setString(15, txtCityName.getText());
            pst.setString(16, txtCountry.getText());
            pst.setString(17, txtGovernorateName.getText());
            pst.setString(18, txtPostalCode.getText());
            pst.setString(19, jComboBox1.getSelectedItem().toString());
            pst.setString(20, jComboBox.getSelectedItem().toString());
            pst.setString(21, cboBirthYear.getSelectedItem().toString());
            pst.setString(22, ageValue.getText());
            pst.setString(23, txtEmail.getText());
            pst.setString(24, txtHomePhone.getText());
            pst.setString(25, txtMobile.getText());
            pst.setString(26, type_of_funding.getSelectedItem().toString());
            pst.setString(27, number_of_payments.getSelectedItem().toString());
            pst.setString(28, total_amount_paid.getText());
            pst.setString(29, details_of_payment[0]);
            pst.setString(30, details_of_payment[1]);
            pst.setString(31, details_of_payment[2]);
            pst.setString(32, details_of_payment[3]);
            pst.setString(33, details_of_payment[4]);
            pst.setString(34, details_of_payment[5]);
            pst.setString(35, maximum_hours.getText());
            pst.setString(36, finished_hours.getText());
            pst.setString(37, current_hours.getText());
            pst.setString(38, remaining_hours.getText());
            pst.setDouble(39, GPA[0]);
            pst.setDouble(40, GPA[1]);
            pst.setDouble(41, GPA[2]);
            pst.setDouble(42, GPA[3]);
            pst.setDouble(43, GPA[4]);
            pst.setDouble(44, GPA[5]);
            pst.setDouble(45, GPA[6]);
            pst.setDouble(46, GPA[7]);
            pst.setDouble(47, GPA[8]);
            pst.setDouble(48, GPA[9]);
            pst.setString(49, num_of_sem.getText());
            pst.setString(50, txtNumberOfFinishedCourses.getText());
            pst.setString(51,txtTotalNumberOfCreditHoursFinished.getText());
            pst.setString(52, cboFinishedCourses.getSelectedItem().toString());
            pst.setString(53, txtCourseCodeFinished.getText());
            pst.setString(54,txtCourseCreditHoursFinished.getText());
            pst.setString(55, cboFinishedInSemester.getSelectedItem().toString());
            pst.setString(56, cboInYear.getSelectedItem().toString());
            pst.setString(57, txtCourseTurorNameFinished.getText());
            pst.setString(58, txtCourseLabTutorNameFinished.getText());
            pst.setString(59,txtCourseGrade.getText());
            pst.setString(60, txtCoursePercentage.getText());
            pst.setString(61,txtNumberOfCurrentCourses.getText());
            pst.setString(62,txtTotalNumberOfCreditHoursCurrent.getText());
            pst.setString(63,cboCurrentCourses.getSelectedItem().toString());
            pst.setString(64, txtCousreCodeCurrent.getText());
            pst.setString(65, txtCourseCreditHoursCurrent.getText());
            pst.setString(66,cboNumberOfTimeTakingCourse.getSelectedItem().toString());
            pst.setString(67,txtCourseTutorNameCurrent.getText());
            pst.setString(68,txtCourseLabTutorNameCurrent.getText());
            pst.setString(69, txt7thMark.getText());
            pst.setString(70, txt12thMark.getText());
            pst.setString(71, txtYearWorkMark.getText());
            pst.setString(72, txtFinalExamMark.getText());
            pst.setString(73, courseGrade.getText());
            pst.setString(74, CoursePercentage.getText());
            
            
            
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Student Record Added");
            tableUpdate();
            txtID.setText("");
            txtfirstname.setText("");
            txtmiddlename.setText("");
            txtlastname.setText("");
            cboYear.setSelectedIndex(0);
            cboTerm.setSelectedIndex(0);
            cboFaculity.setSelectedIndex(0);
            txtDepartment.setText("");
            cboNationality.setSelectedIndex(0);
            cboGender.setSelectedIndex(0);
            txtFlatNum.setText("");
            txtHouseNum.setText("");
            txtStreetName.setText("");
            txtAreaName.setText("");
            txtCityName.setText("");
            txtCountry.setText("");
            txtGovernorateName.setText("");
            txtPostalCode.setText("");
            jComboBox1.setSelectedIndex(0);
            jComboBox.setSelectedIndex(0);
            cboBirthYear.setSelectedIndex(0);
            ageValue.setText("");
            txtEmail.setText("");
            txtHomePhone.setText("");
            txtMobile.setText("");
            type_of_funding.setSelectedIndex(0);
            number_of_payments.setSelectedIndex(0);
            total_amount_paid.setText("");
            amount_paid.setText("");
            transaction_number.setText("");
            bank_of_transaction.setText("");
            dot_day.setSelectedIndex(0);
            dot_month.setSelectedIndex(0);
            dot_year.setSelectedIndex(0);
            maximum_hours.setText("0");
            finished_hours.setText("0");
            current_hours.setText("0");
            remaining_hours.setText("");
            gpa_sem1.setText("0");
            gpa_sem2.setText("0");
            gpa_sem3.setText("0");
            gpa_sem4.setText("0");
            gpa_sem5.setText("0");
            gpa_sem6.setText("0");
            gpa_sem7.setText("0");
            gpa_sem8.setText("0");
            gpa_sem9.setText("0");
            gpa_sem10.setText("0");
            num_of_sem.setText("");
            txtNumberOfFinishedCourses.setText("");
            txtTotalNumberOfCreditHoursFinished.setText("");
            cboFinishedCourses.setSelectedIndex(0);
            txtCourseCodeFinished.setText("");
            txtCourseCreditHoursFinished.setText("");
            cboFinishedInSemester.setSelectedIndex(0);
            cboInYear.setSelectedIndex(0);
            txtCourseTurorNameFinished.setText("");
            txtCourseLabTutorNameFinished.setText("");
            txtCourseGrade.setText("");
            txtCoursePercentage.setText("");
            txtNumberOfCurrentCourses.setText("");
            txtTotalNumberOfCreditHoursCurrent.setText("");
            cboCurrentCourses.setSelectedIndex(0);
            txtCousreCodeCurrent.setText("");
            txtCourseCreditHoursCurrent.setText("");
            cboNumberOfTimeTakingCourse.setSelectedIndex(0);
            txtCourseTutorNameCurrent.setText("");
            txtCourseLabTutorNameCurrent.setText("");
            txt7thMark.setText("0");
            txt12thMark.setText("0");
            txtYearWorkMark.setText("0");
            txtFinalExamMark.setText("0");
            courseGrade.setText("0");
            CoursePercentage.setText("0");
            

        }catch(SQLException e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_butAddNewActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // TODO add your handling code here:
        try{
            int age = Age(jComboBox1.getSelectedItem().toString(),jComboBox.getSelectedItem().toString(),cboBirthYear.getSelectedItem().toString());
            ageValue.setText(Integer.toString(age));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"wrong age");
            jComboBox.setSelectedIndex(0);
            jComboBox1.setSelectedIndex(0);
            cboBirthYear.setSelectedIndex(0);
            ageValue.setText("");
        }
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void cboBirthYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBirthYearActionPerformed
        // TODO add your handling code here:
        try{
            int age = Age(jComboBox1.getSelectedItem().toString(),jComboBox.getSelectedItem().toString(),cboBirthYear.getSelectedItem().toString());
            ageValue.setText(Integer.toString(age));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"wrong age");
            jComboBox.setSelectedIndex(0);
            jComboBox1.setSelectedIndex(0);
            cboBirthYear.setSelectedIndex(0);
            ageValue.setText("");
        }
    }//GEN-LAST:event_cboBirthYearActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel df =(DefaultTableModel)table.getModel();
        int selectedRow =table.getSelectedRow();
        txtID.setText(df.getValueAt(selectedRow,1).toString());
        txtfirstname.setText(df.getValueAt(selectedRow,2).toString());
        txtmiddlename.setText(df.getValueAt(selectedRow,3).toString());
        txtlastname.setText(df.getValueAt(selectedRow,4).toString());
        cboYear.setSelectedItem(df.getValueAt(selectedRow,5).toString());
        cboTerm.setSelectedItem(df.getValueAt(selectedRow,6).toString());
        cboFaculity.setSelectedItem(df.getValueAt(selectedRow,7).toString());
        txtDepartment.setText(df.getValueAt(selectedRow,8).toString());
        cboNationality.setSelectedItem(df.getValueAt(selectedRow,9).toString());
        cboGender.setSelectedItem(df.getValueAt(selectedRow,10).toString());
        txtFlatNum.setText(df.getValueAt(selectedRow,11).toString());
        txtHouseNum.setText(df.getValueAt(selectedRow,12).toString());
        txtStreetName.setText(df.getValueAt(selectedRow,13).toString());
        txtAreaName.setText(df.getValueAt(selectedRow,14).toString());
        txtCityName.setText(df.getValueAt(selectedRow,15).toString());
        txtCountry.setText(df.getValueAt(selectedRow,16).toString());
        txtGovernorateName.setText(df.getValueAt(selectedRow,17).toString());
        txtPostalCode.setText(df.getValueAt(selectedRow,18).toString());
        jComboBox1.setSelectedItem(df.getValueAt(selectedRow,19).toString());
        jComboBox.setSelectedItem(df.getValueAt(selectedRow,20).toString());
        cboBirthYear.setSelectedItem(df.getValueAt(selectedRow,21).toString());
        ageValue.setText(df.getValueAt(selectedRow,22).toString());
        txtEmail.setText(df.getValueAt(selectedRow,23).toString());
        txtHomePhone.setText(df.getValueAt(selectedRow,24).toString());
        txtMobile.setText(df.getValueAt(selectedRow,25).toString());
        type_of_funding.setSelectedItem(df.getValueAt(selectedRow,26).toString());
        number_of_payments.setSelectedItem(df.getValueAt(selectedRow,27).toString());
        total_amount_paid.setText(df.getValueAt(selectedRow,28).toString());
        amount_paid.setText(df.getValueAt(selectedRow,29).toString());
        transaction_number.setText(df.getValueAt(selectedRow,30).toString());
        bank_of_transaction.setText(df.getValueAt(selectedRow,31).toString());
        dot_day.setSelectedItem(df.getValueAt(selectedRow,32).toString());
        dot_month.setSelectedItem(df.getValueAt(selectedRow,33).toString());
        dot_year.setSelectedItem(df.getValueAt(selectedRow,34).toString());
        maximum_hours.setText(df.getValueAt(selectedRow,35).toString());
        finished_hours.setText(df.getValueAt(selectedRow,36).toString());
        current_hours.setText(df.getValueAt(selectedRow,37).toString());
        remaining_hours.setText(df.getValueAt(selectedRow,38).toString());
        gpa_sem1.setText(df.getValueAt(selectedRow,39).toString());
        gpa_sem2.setText(df.getValueAt(selectedRow,40).toString());
        gpa_sem3.setText(df.getValueAt(selectedRow,41).toString());
        gpa_sem4.setText(df.getValueAt(selectedRow,42).toString());
        gpa_sem5.setText(df.getValueAt(selectedRow,43).toString());
        gpa_sem6.setText(df.getValueAt(selectedRow,44).toString());
        gpa_sem7.setText(df.getValueAt(selectedRow,45).toString());
        gpa_sem8.setText(df.getValueAt(selectedRow,46).toString());
        gpa_sem9.setText(df.getValueAt(selectedRow,47).toString());
        gpa_sem10.setText(df.getValueAt(selectedRow,48).toString());
        num_of_sem.setText(df.getValueAt(selectedRow,49).toString());
        txtNumberOfFinishedCourses.setText(df.getValueAt(selectedRow, 50).toString());
        txtTotalNumberOfCreditHoursFinished.setText(df.getValueAt(selectedRow, 51).toString());
        cboFinishedCourses.setSelectedItem(df.getValueAt(selectedRow, 52).toString());
        txtCourseCodeFinished.setText(df.getValueAt(selectedRow, 53).toString());
        txtCourseCreditHoursFinished.setText(df.getValueAt(selectedRow, 54).toString());
        cboFinishedInSemester.setSelectedItem(df.getValueAt(selectedRow,55).toString());
        cboInYear.setSelectedItem(df.getValueAt(selectedRow, 56).toString());
        txtCourseTurorNameFinished.setText(df.getValueAt(selectedRow, 57).toString());
        txtCourseLabTutorNameFinished.setText(df.getValueAt(selectedRow, 58).toString());
        txtCourseGrade.setText(df.getValueAt(selectedRow, 59).toString());
        txtCoursePercentage.setText(df.getValueAt(selectedRow, 60).toString());
        txtNumberOfCurrentCourses.setText(df.getValueAt(selectedRow, 61).toString());
        txtTotalNumberOfCreditHoursCurrent.setText(df.getValueAt(selectedRow, 62).toString());
        cboCurrentCourses.setSelectedItem(df.getValueAt(selectedRow, 63).toString());
        txtCousreCodeCurrent.setText(df.getValueAt(selectedRow, 64).toString());
        txtCourseCreditHoursCurrent.setText(df.getValueAt(selectedRow, 65).toString());
        cboNumberOfTimeTakingCourse.setSelectedItem(df.getValueAt(selectedRow, 66).toString());
        txtCourseTutorNameCurrent.setText(df.getValueAt(selectedRow, 67).toString());
        txtCourseLabTutorNameCurrent.setText(df.getValueAt(selectedRow, 68).toString());
        txt7thMark.setText(df.getValueAt(selectedRow, 69).toString());
        txt12thMark.setText(df.getValueAt(selectedRow, 70).toString());
        txtYearWorkMark.setText(df.getValueAt(selectedRow, 71).toString());
        txtFinalExamMark.setText(df.getValueAt(selectedRow, 72).toString());
        courseGrade.setText(df.getValueAt(selectedRow, 73).toString());
        CoursePercentage.setText(df.getValueAt(selectedRow, 74).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void txtmiddlenameAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtmiddlenameAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmiddlenameAncestorMoved

    private void txtStreetNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStreetNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStreetNameActionPerformed

    private void txtMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileActionPerformed

    private void txtSearchByStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchByStudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchByStudentIDActionPerformed

    private void txtSearchByStudentIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchByStudentIDKeyPressed
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearchByStudentID.getText().trim()));
    }//GEN-LAST:event_txtSearchByStudentIDKeyPressed

    private void butUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butUpdateActionPerformed
        // TODO add your handling code here:
        arrayValue();
        DefaultTableModel df =(DefaultTableModel)table.getModel();
        int selectedRow =table.getSelectedRow();
        try{
            int id = Integer.parseInt(df.getValueAt(selectedRow,0).toString());
            pst = con.prepareStatement("update student set student_id=?,first_name=?,middle_name=?,last_name=?,year=?,term=?,faculty=?,department=?,nationality=?,gender"
                    + "=?,flat_number=?,house_number=?,street=?,area=?,city=?,country=?,governorate=?,postal_code=?,dob_day=?, dob_month=?,dob_year=?,age=?,email=?,"
                    + "home_phone=?,mobile=?,type_of_funding=?,number_of_payments=?,total_amount_paid=?,amount_paid=?,transaction_number=?,bank_of_transaction=?,"
                    + "dot_day=?,dot_month=?,dot_year=?,maximum_hours=?,finished_hours=?,current_hours=?,remaining_hours=?,gpa_sem1=?,gpa_sem2=?,gpa_sem3=?,gpa_sem4=?,gpa_sem5=?,"
                    + "gpa_sem6=?,gpa_sem7=?,gpa_sem8=?,gpa_sem9=?,gpa_sem10=?,num_of_sem=?,num_finished_course=?,total_credit_hour_finished=?,finished_course=?,course_code=?,"
                    + "course_credit_hour=?,finished_in_semester=?,finished_in_year=?,finish_course_tutor_name=?,finish_lab_course_tutor_name=?,finished_grade=?,finished_percentage=?,"
                    + "num_current_courses=?,total_credit_hour_current=?,current_course=?,current_course_code=?,current_course_credit_hour=?,time_taking_the_course=?,current_course_tutor_name=?,"
                    + "current_lab_course_tutor_name=?,7th_mark=?,12th_mark=?,current_year_work_mark=?,current_final_mark=?,current_course_grade=?,current_course_percentage=?"
                    + "where id=?");
            pst.setString(1, txtID.getText());
            pst.setString(2, txtfirstname.getText());
            pst.setString(3, txtmiddlename.getText());
            pst.setString(4, txtlastname.getText());
            pst.setString(5, cboYear.getSelectedItem().toString());
            pst.setString(6, cboTerm.getSelectedItem().toString());
            pst.setString(7, cboFaculity.getSelectedItem().toString());
            pst.setString(8, txtDepartment.getText());
            pst.setString(9, cboNationality.getSelectedItem().toString());
            pst.setString(10, cboGender.getSelectedItem().toString());
            pst.setString(11, txtFlatNum.getText());
            pst.setString(12, txtHouseNum.getText());
            pst.setString(13, txtStreetName.getText());
            pst.setString(14, txtAreaName.getText());
            pst.setString(15, txtCityName.getText());
            pst.setString(16, txtCountry.getText());
            pst.setString(17, txtGovernorateName.getText());
            pst.setString(18, txtPostalCode.getText());
            pst.setString(19, jComboBox1.getSelectedItem().toString());
            pst.setString(20, jComboBox.getSelectedItem().toString());
            pst.setString(21, cboBirthYear.getSelectedItem().toString());
            pst.setString(22, ageValue.getText());
            pst.setString(23, txtEmail.getText());
            pst.setString(24, txtHomePhone.getText());
            pst.setString(25, txtMobile.getText());
            pst.setString(26, type_of_funding.getSelectedItem().toString());
            pst.setString(27, number_of_payments.getSelectedItem().toString());
            pst.setString(28, total_amount_paid.getText());
            pst.setString(29, details_of_payment[0]);
            pst.setString(30, details_of_payment[1]);
            pst.setString(31, details_of_payment[2]);
            pst.setString(32, details_of_payment[3]);
            pst.setString(33, details_of_payment[4]);
            pst.setString(34, details_of_payment[5]);
            pst.setString(35, maximum_hours.getText());
            pst.setString(36, finished_hours.getText());
            pst.setString(37, current_hours.getText());
            pst.setString(38, remaining_hours.getText());
            pst.setDouble(39, GPA[0]);
            pst.setDouble(40, GPA[1]);
            pst.setDouble(41, GPA[2]);
            pst.setDouble(42, GPA[3]);
            pst.setDouble(43, GPA[4]);
            pst.setDouble(44, GPA[5]);
            pst.setDouble(45, GPA[6]);
            pst.setDouble(46, GPA[7]);
            pst.setDouble(47, GPA[8]);
            pst.setDouble(48, GPA[9]);
            pst.setString(49, num_of_sem.getText());
            pst.setString(50, txtNumberOfFinishedCourses.getText());
            pst.setString(51,txtTotalNumberOfCreditHoursFinished.getText());
            pst.setString(52, cboFinishedCourses.getSelectedItem().toString());
            pst.setString(53, txtCourseCodeFinished.getText());
            pst.setString(54,txtCourseCreditHoursFinished.getText());
            pst.setString(55, cboFinishedInSemester.getSelectedItem().toString());
            pst.setString(56, cboInYear.getSelectedItem().toString());
            pst.setString(57, txtCourseTurorNameFinished.getText());
            pst.setString(58, txtCourseLabTutorNameFinished.getText());
            pst.setString(59,txtCourseGrade.getText());
            pst.setString(60, txtCoursePercentage.getText());
            pst.setString(61,txtNumberOfCurrentCourses.getText());
            pst.setString(62,txtTotalNumberOfCreditHoursCurrent.getText());
            pst.setString(63,cboCurrentCourses.getSelectedItem().toString());
            pst.setString(64, txtCousreCodeCurrent.getText());
            pst.setString(65, txtCourseCreditHoursCurrent.getText());
            pst.setString(66,cboNumberOfTimeTakingCourse.getSelectedItem().toString());
            pst.setString(67,txtCourseTutorNameCurrent.getText());
            pst.setString(68,txtCourseLabTutorNameCurrent.getText());
            pst.setString(69, txt7thMark.getText());
            pst.setString(70, txt12thMark.getText());
            pst.setString(71, txtYearWorkMark.getText());
            pst.setString(72, txtFinalExamMark.getText());
            pst.setString(73, courseGrade.getText());
            pst.setString(74, CoursePercentage.getText());
            pst.setInt(75, id);
            
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Student Record Updated");
            tableUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_butUpdateActionPerformed

    private void number_of_paymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_of_paymentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_number_of_paymentsActionPerformed

    private void dot_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dot_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dot_yearActionPerformed

    private void dot_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dot_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dot_monthActionPerformed

    private void dot_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dot_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dot_dayActionPerformed

    private void total_amount_paidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_total_amount_paidFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_total_amount_paidFocusGained

    private void total_amount_paidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_total_amount_paidFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_total_amount_paidFocusLost

    private void total_amount_paidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_amount_paidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_amount_paidActionPerformed

    private void total_amount_paidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_total_amount_paidKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_total_amount_paidKeyTyped

    private void current_hoursFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_current_hoursFocusGained
        // TODO add your handling code here:
        remaining_hours_value();
    }//GEN-LAST:event_current_hoursFocusGained

    private void current_hoursFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_current_hoursFocusLost
        // TODO add your handling code here:
        remaining_hours_value();
    }//GEN-LAST:event_current_hoursFocusLost

    private void current_hoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_current_hoursActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_current_hoursActionPerformed

    private void current_hoursKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_current_hoursKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_current_hoursKeyTyped

    private void bank_of_transactionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bank_of_transactionFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_bank_of_transactionFocusGained

    private void bank_of_transactionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bank_of_transactionFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_bank_of_transactionFocusLost

    private void bank_of_transactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bank_of_transactionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bank_of_transactionActionPerformed

    private void bank_of_transactionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bank_of_transactionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_bank_of_transactionKeyTyped

    private void amount_paidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amount_paidFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_amount_paidFocusGained

    private void amount_paidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amount_paidFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_amount_paidFocusLost

    private void amount_paidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amount_paidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amount_paidActionPerformed

    private void amount_paidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amount_paidKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_amount_paidKeyTyped

    private void gpa_sem1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpa_sem1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem1FocusGained

    private void gpa_sem1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpa_sem1FocusLost
        // TODO add your handling code here:
        gpaCalculator();
    }//GEN-LAST:event_gpa_sem1FocusLost

    private void gpa_sem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpa_sem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem1ActionPerformed

    private void gpa_sem1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gpa_sem1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem1KeyTyped

    private void finished_hoursFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_finished_hoursFocusGained
        // TODO add your handling code here:
        remaining_hours_value();
    }//GEN-LAST:event_finished_hoursFocusGained

    private void finished_hoursFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_finished_hoursFocusLost
        // TODO add your handling code here:
        remaining_hours_value();
    }//GEN-LAST:event_finished_hoursFocusLost

    private void finished_hoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finished_hoursActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_finished_hoursActionPerformed

    private void finished_hoursKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_finished_hoursKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_finished_hoursKeyTyped

    private void maximum_hoursFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_maximum_hoursFocusGained
        // TODO add your handling code here:
        remaining_hours_value();
    }//GEN-LAST:event_maximum_hoursFocusGained

    private void maximum_hoursFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_maximum_hoursFocusLost
        // TODO add your handling code here:
        remaining_hours_value();
    }//GEN-LAST:event_maximum_hoursFocusLost

    private void maximum_hoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maximum_hoursActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_maximum_hoursActionPerformed

    private void maximum_hoursKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_maximum_hoursKeyTyped
        // TODO add your handling code here:
        //remaining_hours_value();
    }//GEN-LAST:event_maximum_hoursKeyTyped

    private void gpa_sem2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpa_sem2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem2FocusGained

    private void gpa_sem2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpa_sem2FocusLost
        // TODO add your handling code here:
        gpaCalculator();
    }//GEN-LAST:event_gpa_sem2FocusLost

    private void gpa_sem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpa_sem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem2ActionPerformed

    private void gpa_sem2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gpa_sem2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem2KeyTyped

    private void gpa_sem3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpa_sem3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem3FocusGained

    private void gpa_sem3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpa_sem3FocusLost
        // TODO add your handling code here:
        gpaCalculator();
    }//GEN-LAST:event_gpa_sem3FocusLost

    private void gpa_sem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpa_sem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem3ActionPerformed

    private void gpa_sem3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gpa_sem3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem3KeyTyped

    private void gpa_sem4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpa_sem4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem4FocusGained

    private void gpa_sem4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpa_sem4FocusLost
        // TODO add your handling code here:
        gpaCalculator();
    }//GEN-LAST:event_gpa_sem4FocusLost

    private void gpa_sem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpa_sem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem4ActionPerformed

    private void gpa_sem4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gpa_sem4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem4KeyTyped

    private void gpa_sem6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpa_sem6FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem6FocusGained

    private void gpa_sem6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpa_sem6FocusLost
        // TODO add your handling code here:
        gpaCalculator();
    }//GEN-LAST:event_gpa_sem6FocusLost

    private void gpa_sem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpa_sem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem6ActionPerformed

    private void gpa_sem6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gpa_sem6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem6KeyTyped

    private void gpa_sem7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpa_sem7FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem7FocusGained

    private void gpa_sem7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpa_sem7FocusLost
        // TODO add your handling code here:
        gpaCalculator();
    }//GEN-LAST:event_gpa_sem7FocusLost

    private void gpa_sem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpa_sem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem7ActionPerformed

    private void gpa_sem7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gpa_sem7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem7KeyTyped

    private void gpa_sem8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpa_sem8FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem8FocusGained

    private void gpa_sem8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpa_sem8FocusLost
        // TODO add your handling code here:
        gpaCalculator();
    }//GEN-LAST:event_gpa_sem8FocusLost

    private void gpa_sem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpa_sem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem8ActionPerformed

    private void gpa_sem8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gpa_sem8KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem8KeyTyped

    private void gpa_sem9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpa_sem9FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem9FocusGained

    private void gpa_sem9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpa_sem9FocusLost
        // TODO add your handling code here:
        gpaCalculator();
    }//GEN-LAST:event_gpa_sem9FocusLost

    private void gpa_sem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpa_sem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem9ActionPerformed

    private void gpa_sem9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gpa_sem9KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem9KeyTyped

    private void gpa_sem5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpa_sem5FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem5FocusGained

    private void gpa_sem5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpa_sem5FocusLost
        // TODO add your handling code here:
        gpaCalculator();
    }//GEN-LAST:event_gpa_sem5FocusLost

    private void gpa_sem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpa_sem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem5ActionPerformed

    private void gpa_sem5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gpa_sem5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem5KeyTyped

    private void gpa_sem10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpa_sem10FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem10FocusGained

    private void gpa_sem10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpa_sem10FocusLost
        // TODO add your handling code here:
        gpaCalculator();
    }//GEN-LAST:event_gpa_sem10FocusLost

    private void gpa_sem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpa_sem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem10ActionPerformed

    private void gpa_sem10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gpa_sem10KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa_sem10KeyTyped

    private void transaction_numberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_transaction_numberFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_transaction_numberFocusGained

    private void transaction_numberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_transaction_numberFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_transaction_numberFocusLost

    private void transaction_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaction_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transaction_numberActionPerformed

    private void transaction_numberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transaction_numberKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_transaction_numberKeyTyped

    private void maximum_hoursKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_maximum_hoursKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_maximum_hoursKeyReleased

    private void finished_hoursKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_finished_hoursKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_finished_hoursKeyReleased

    private void current_hoursKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_current_hoursKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_current_hoursKeyReleased

    private void cboFinishedCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboFinishedCoursesActionPerformed
        arrayValue();
        if(cboFinishedCourses.getSelectedItem().toString().equals(Courses[0][0])){
        txtCourseCodeFinished.setText(Courses[0][1]);
        txtCourseCreditHoursFinished.setText(Courses[0][2]);
        txtCourseTurorNameFinished.setText(Courses[0][3]);
        txtCourseLabTutorNameFinished.setText(Courses[0][4]);
        }else if(cboFinishedCourses.getSelectedItem().toString().equals(Courses[1][0])){
        txtCourseCodeFinished.setText(Courses[1][1]);
        txtCourseCreditHoursFinished.setText(Courses[1][2]);
        txtCourseTurorNameFinished.setText(Courses[1][3]);
        txtCourseLabTutorNameFinished.setText(Courses[1][4]);
        }else if(cboFinishedCourses.getSelectedItem().toString().equals(Courses[2][0])){
        txtCourseCodeFinished.setText(Courses[2][1]);
        txtCourseCreditHoursFinished.setText(Courses[2][2]);
        txtCourseTurorNameFinished.setText(Courses[2][3]);
        txtCourseLabTutorNameFinished.setText(Courses[2][4]);
        }else if(cboFinishedCourses.getSelectedItem().toString().equals(Courses[3][0])){
        txtCourseCodeFinished.setText(Courses[3][1]);
        txtCourseCreditHoursFinished.setText(Courses[3][2]);
        txtCourseTurorNameFinished.setText(Courses[3][3]);
        txtCourseLabTutorNameFinished.setText(Courses[3][4]);
        }else if(cboFinishedCourses.getSelectedItem().toString().equals(Courses[4][0])){
        txtCourseCodeFinished.setText(Courses[4][1]);
        txtCourseCreditHoursFinished.setText(Courses[4][2]);
        txtCourseTurorNameFinished.setText(Courses[4][3]);
        txtCourseLabTutorNameFinished.setText(Courses[4][4]);
        }else{
        txtCourseCodeFinished.setText("");
        txtCourseCreditHoursFinished.setText("");
        txtCourseTurorNameFinished.setText("");
        txtCourseLabTutorNameFinished.setText("");
        }
    }//GEN-LAST:event_cboFinishedCoursesActionPerformed

    private void txtCourseTurorNameFinishedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseTurorNameFinishedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseTurorNameFinishedActionPerformed

    private void cboCurrentCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCurrentCoursesActionPerformed
        courseValue();
        if(cboCurrentCourses.getSelectedItem().toString().equals(Courses[5][0])){
        txtCousreCodeCurrent.setText(Courses[5][1]);
        txtCourseCreditHoursCurrent.setText(Courses[5][2]);
        txtCourseTutorNameCurrent.setText(Courses[5][3]);
        txtCourseLabTutorNameCurrent.setText(Courses[5][4]);
        txt7thMark.setText("0");
        txt12thMark.setText("0");
        txtYearWorkMark.setText("0");
        txtFinalExamMark.setText("0");
        courseGrade.setText("0");
        CoursePercentage.setText("0");
        }else if(cboCurrentCourses.getSelectedItem().toString().equals(Courses[6][0])){
        txtCousreCodeCurrent.setText(Courses[6][1]);
        txtCourseCreditHoursCurrent.setText(Courses[6][2]);
        txtCourseTutorNameCurrent.setText(Courses[6][3]);
        txtCourseLabTutorNameCurrent.setText(Courses[6][4]);
        txt7thMark.setText("0");
        txt12thMark.setText("0");
        txtYearWorkMark.setText("0");
        txtFinalExamMark.setText("0");
         courseGrade.setText("0");
        CoursePercentage.setText("0");
        }else if(cboCurrentCourses.getSelectedItem().toString().equals(Courses[7][0])){
        txtCousreCodeCurrent.setText(Courses[7][1]);
        txtCourseCreditHoursCurrent.setText(Courses[7][2]);
        txtCourseTutorNameCurrent.setText(Courses[7][3]);
        txtCourseLabTutorNameCurrent.setText(Courses[7][4]);
        txt7thMark.setText("0");
        txt12thMark.setText("0");
        txtYearWorkMark.setText("0");
        txtFinalExamMark.setText("0");
         courseGrade.setText("0");
        CoursePercentage.setText("0");
        }else if(cboCurrentCourses.getSelectedItem().toString().equals(Courses[8][0])){
        txtCousreCodeCurrent.setText(Courses[8][1]);
        txtCourseCreditHoursCurrent.setText(Courses[8][2]);
        txtCourseTutorNameCurrent.setText(Courses[8][3]);
        txtCourseLabTutorNameCurrent.setText(Courses[8][4]);
        txt7thMark.setText("0");
        txt12thMark.setText("0");
        txtYearWorkMark.setText("0");
        txtFinalExamMark.setText("0");
         courseGrade.setText("0");
        CoursePercentage.setText("0");
        }else if(cboCurrentCourses.getSelectedItem().toString().equals(Courses[9][0])){
        txtCousreCodeCurrent.setText(Courses[9][1]);
        txtCourseCreditHoursCurrent.setText(Courses[9][2]);
        txtCourseTutorNameCurrent.setText(Courses[9][3]);
        txtCourseLabTutorNameCurrent.setText(Courses[9][4]);
        txt7thMark.setText("0");
        txt12thMark.setText("0");
        txtYearWorkMark.setText("0");
        txtFinalExamMark.setText("0");
         courseGrade.setText("0");
        CoursePercentage.setText("0");
        }else if(cboCurrentCourses.getSelectedItem().toString().equals(Courses[10][0])){
        txtCousreCodeCurrent.setText(Courses[10][1]);
        txtCourseCreditHoursCurrent.setText(Courses[10][2]);
        txtCourseTutorNameCurrent.setText(Courses[10][3]);
        txtCourseLabTutorNameCurrent.setText(Courses[10][4]);
        txt7thMark.setText("0");
        txt12thMark.setText("0");
        txtYearWorkMark.setText("0");
        txtFinalExamMark.setText("0");
         courseGrade.setText("0");
        CoursePercentage.setText("0");
        }else{
        txtCousreCodeCurrent.setText("");
        txtCourseCreditHoursCurrent.setText("");
        txtCourseTutorNameCurrent.setText("");
        txtCourseLabTutorNameCurrent.setText("");
        txt7thMark.setText("0");
        txt12thMark.setText("0");
        txtYearWorkMark.setText("0");
        txtFinalExamMark.setText("0");
         courseGrade.setText("0");
        CoursePercentage.setText("0");
        }
    }//GEN-LAST:event_cboCurrentCoursesActionPerformed

    private void txt7thMarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt7thMarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt7thMarkActionPerformed

    private void txt7thMarkFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt7thMarkFocusLost
        MarksCalculater();
        CourseGrade_Percentage();
    }//GEN-LAST:event_txt7thMarkFocusLost

    private void txt12thMarkFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt12thMarkFocusLost
        MarksCalculater();
        CourseGrade_Percentage();
    }//GEN-LAST:event_txt12thMarkFocusLost

    private void txtYearWorkMarkFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYearWorkMarkFocusLost
        MarksCalculater();
        CourseGrade_Percentage();
    }//GEN-LAST:event_txtYearWorkMarkFocusLost

    private void txtFinalExamMarkFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFinalExamMarkFocusLost
        MarksCalculater();
        CourseGrade_Percentage();
    }//GEN-LAST:event_txtFinalExamMarkFocusLost

    private void txtTotalNumberOfCreditHoursCurrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalNumberOfCreditHoursCurrentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalNumberOfCreditHoursCurrentActionPerformed

    private void butRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRefreshActionPerformed
        // TODO add your handling code here:
        tableUpdate();
    }//GEN-LAST:event_butRefreshActionPerformed

    private void butResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butResetActionPerformed
        // TODO add your handling code here:
        txtID.setText("");
        txtfirstname.setText("");
        txtmiddlename.setText("");
        txtlastname.setText("");
        cboYear.setSelectedIndex(0);
        cboTerm.setSelectedIndex(0);
        cboFaculity.setSelectedIndex(0);
        txtDepartment.setText("");
        cboNationality.setSelectedIndex(0);
        cboGender.setSelectedIndex(0);
        txtFlatNum.setText("");
        txtHouseNum.setText("");
        txtStreetName.setText("");
        txtAreaName.setText("");
        txtCityName.setText("");
        txtCountry.setText("");
        txtGovernorateName.setText("");
        txtPostalCode.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox.setSelectedIndex(0);
        cboBirthYear.setSelectedIndex(0);
        ageValue.setText("");
        txtEmail.setText("");
        txtHomePhone.setText("");
        txtMobile.setText("");
        type_of_funding.setSelectedIndex(0);
        number_of_payments.setSelectedIndex(0);
        total_amount_paid.setText("");
        amount_paid.setText("");
        transaction_number.setText("");
        bank_of_transaction.setText("");
        dot_day.setSelectedIndex(0);
        dot_month.setSelectedIndex(0);
        dot_year.setSelectedIndex(0);
        maximum_hours.setText("0");
        finished_hours.setText("0");
        current_hours.setText("0");
        remaining_hours.setText("");
        gpa_sem1.setText("0");
        gpa_sem2.setText("0");
        gpa_sem3.setText("0");
        gpa_sem4.setText("0");
        gpa_sem5.setText("0");
        gpa_sem6.setText("0");
        gpa_sem7.setText("0");
        gpa_sem8.setText("0");
        gpa_sem9.setText("0");
        gpa_sem10.setText("0");
        num_of_sem.setText("");
        txtNumberOfFinishedCourses.setText("");
        txtTotalNumberOfCreditHoursFinished.setText("");
        cboFinishedCourses.setSelectedIndex(0);
        txtCourseCodeFinished.setText("");
        txtCourseCreditHoursFinished.setText("");
        cboFinishedInSemester.setSelectedIndex(0);
        cboInYear.setSelectedIndex(0);
        txtCourseTurorNameFinished.setText("");
        txtCourseLabTutorNameFinished.setText("");
        txtCourseGrade.setText("");
        txtCoursePercentage.setText("");
        txtNumberOfCurrentCourses.setText("");
        txtTotalNumberOfCreditHoursCurrent.setText("");
        cboCurrentCourses.setSelectedIndex(0);
        txtCousreCodeCurrent.setText("");
        txtCourseCreditHoursCurrent.setText("");
        cboNumberOfTimeTakingCourse.setSelectedIndex(0);
        txtCourseTutorNameCurrent.setText("");
        txtCourseLabTutorNameCurrent.setText("");
        txt7thMark.setText("0");
        txt12thMark.setText("0");
        txtYearWorkMark.setText("0");
        txtFinalExamMark.setText("0");
        courseGrade.setText("0");
        CoursePercentage.setText("0");
    }//GEN-LAST:event_butResetActionPerformed

    
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DataProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataProject().setVisible(true);
            }
        });
    }
    
    
    public static int Age(String day,String month,String year){
        int d = Integer.parseInt(day);
        int m = Integer.parseInt(month);
        int y = Integer.parseInt(year);
        LocalDate birthdate = LocalDate.of(y, m, d);
        LocalDate now = LocalDate.now();
        Period period = Period.between(birthdate, now);
        return period.getYears();
    }
    private void tableUpdate(){
    try{
        int c;
        pst = con.prepareStatement("select * from student");
        ResultSet rs = pst.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();
        c = rsmd.getColumnCount();
        DefaultTableModel df =(DefaultTableModel)table.getModel();
        df.setRowCount(0);
        while(rs.next()){
            Vector row= new Vector();
            for(int i = 1;i<=c;i++){
                row.add(rs.getString("id"));
                row.add(rs.getString("student_id"));
                row.add(rs.getString("first_name"));
                row.add(rs.getString("middle_name"));
                row.add(rs.getString("last_name"));
                row.add(rs.getString("year"));
                row.add(rs.getString("term"));
                row.add(rs.getString("faculty"));
                row.add(rs.getString("department"));
                row.add(rs.getString("nationality"));
                row.add(rs.getString("gender"));
                row.add(rs.getString("flat_number"));
                row.add(rs.getString("house_number"));
                row.add(rs.getString("street"));
                row.add(rs.getString("area"));
                row.add(rs.getString("city"));
                row.add(rs.getString("country"));
                row.add(rs.getString("governorate"));
                row.add(rs.getString("postal_code"));
                row.add(rs.getString("dob_day"));
                row.add(rs.getString("dob_month"));
                row.add(rs.getString("dob_year"));
                row.add(rs.getString("age"));
                row.add(rs.getString("email"));
                row.add(rs.getString("home_phone"));
                row.add(rs.getString("mobile"));
                row.add(rs.getString("type_of_funding"));
                row.add(rs.getString("number_of_payments"));
                row.add(rs.getString("total_amount_paid"));
                row.add(rs.getString("amount_paid"));
                row.add(rs.getString("transaction_number"));
                row.add(rs.getString("bank_of_transaction"));
                row.add(rs.getString("dot_day"));
                row.add(rs.getString("dot_month"));
                row.add(rs.getString("dot_year"));
                row.add(rs.getString("maximum_hours"));
                row.add(rs.getString("finished_hours"));
                row.add(rs.getString("current_hours"));
                row.add(rs.getString("remaining_hours"));
                row.add(rs.getString("gpa_sem1"));
                row.add(rs.getString("gpa_sem2"));
                row.add(rs.getString("gpa_sem3"));
                row.add(rs.getString("gpa_sem4"));
                row.add(rs.getString("gpa_sem5"));
                row.add(rs.getString("gpa_sem6"));
                row.add(rs.getString("gpa_sem7"));
                row.add(rs.getString("gpa_sem8"));
                row.add(rs.getString("gpa_sem9"));
                row.add(rs.getString("gpa_sem10"));               
                row.add(rs.getString("num_of_sem"));
                row.add(rs.getString("num_finished_course"));
                row.add(rs.getString("total_credit_hour_finished"));
                row.add(rs.getString("finished_course"));
                row.add(rs.getString("course_code"));
                row.add(rs.getString("course_credit_hour"));
                row.add(rs.getString("finished_in_semester"));
                row.add(rs.getString("finished_in_year"));
                row.add(rs.getString("finish_course_tutor_name"));
                row.add(rs.getString("finish_lab_course_tutor_name"));
                row.add(rs.getString("finished_grade"));
                row.add(rs.getString("finished_percentage"));
                row.add(rs.getString("num_current_courses"));
                row.add(rs.getString("total_credit_hour_current"));
                row.add(rs.getString("current_course"));
                row.add(rs.getString("current_course_code"));
                row.add(rs.getString("current_course_credit_hour"));
                row.add(rs.getString("time_taking_the_course"));
                row.add(rs.getString("current_course_tutor_name"));
                row.add(rs.getString("current_lab_course_tutor_name"));
                row.add(rs.getString("7th_mark"));
                row.add(rs.getString("12th_mark"));
                row.add(rs.getString("current_year_work_mark"));
                row.add(rs.getString("current_final_mark"));
                row.add(rs.getString("current_course_grade"));
                row.add(rs.getString("current_course_percentage"));
                
                
            }
            df.addRow(row);
        }
            
            
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }
    
    private void CourseGrade_Percentage(){
  
    int th7Mark = Integer.parseInt(txt7thMark.getText());
    int th12Mark = Integer.parseInt(txt12thMark.getText());
    int yearWorkMark = Integer.parseInt(txtYearWorkMark.getText());
    int FinalMark = Integer.parseInt(txtFinalExamMark.getText());
    int Grade = th7Mark + th12Mark + yearWorkMark + FinalMark;
    if(Grade<=100&&Grade>=90){
    courseGrade.setText("A");
    }else if(Grade<90&&Grade>=85){
    courseGrade.setText("A-");
    }else if(Grade<85&&Grade>=80){
    courseGrade.setText("B+");
    }else if(Grade<80&&Grade>=75){
    courseGrade.setText("B");
    }else if(Grade<75&&Grade>=70){
    courseGrade.setText("B-");
    }else if(Grade<70&&Grade>=65){
    courseGrade.setText("C+");
    }else if(Grade<65&&Grade>=60){
    courseGrade.setText("C");
    }else if(Grade<60&&Grade>=55){
    courseGrade.setText("C-");
    }else if(Grade<55&&Grade>=50){
    courseGrade.setText("D");
    }else if(Grade<50&&Grade>=0){
    courseGrade.setText("F");
    }
    CoursePercentage.setText(Integer.toString(Grade));
    
    }
    
    private void remaining_hours_value(){
        try{
            int maximum = Integer.parseInt(maximum_hours.getText());
            int finished = Integer.parseInt(finished_hours.getText());
            int current = Integer.parseInt(current_hours.getText()); 
            int remaining = maximum-finished-current;
            remaining_hours.setText(Integer.toString(remaining));
        }catch(Exception e){
            if(maximum_hours.getText().equals("")){
                maximum_hours.setText("0");
            }
            if(finished_hours.getText().equals("")){
                finished_hours.setText("0");
            }
            if(current_hours.getText().equals("")){
                current_hours.setText("0");
            }
            JOptionPane.showMessageDialog(this,"Please Enter The Value");
            
        }
    }
    
    private void MarksCalculater(){
    try{
        if(Double.parseDouble(txt7thMark.getText())>30||Double.parseDouble(txt7thMark.getText())<0){
        txt7thMark.setText("0");
        JOptionPane.showMessageDialog(this,"Please Enter The Value Between 0 and 30");
    } if(Double.parseDouble(txt12thMark.getText())>20||Double.parseDouble(txt12thMark.getText())<0){
        txt12thMark.setText("0");
        JOptionPane.showMessageDialog(this,"Please Enter The Value Between 0 and 20");
    } if(Double.parseDouble(txtYearWorkMark.getText())>10||Double.parseDouble(txtYearWorkMark.getText())<0){
        txtYearWorkMark.setText("0");
        JOptionPane.showMessageDialog(this,"Please Enter The Value Between 0 and 10");
    } if(Double.parseDouble(txtFinalExamMark.getText())>40||Double.parseDouble(txtFinalExamMark.getText())<0){
        txtFinalExamMark.setText("0");
        JOptionPane.showMessageDialog(this,"Please Enter The Value Between 0 and 40");
    }
    }catch(Exception e){
    if(txt7thMark.getText().equals("")){
                txt7thMark.setText("0");
                JOptionPane.showMessageDialog(this,"Please Enter The Value");
            }
            if(txt12thMark.getText().equals("")){
                txt12thMark.setText("0");
                JOptionPane.showMessageDialog(this,"Please Enter The Value");
            }if(txtYearWorkMark.getText().equals("")){
                txtYearWorkMark.setText("0");
                JOptionPane.showMessageDialog(this,"Please Enter The Value");
            }
            if(txtFinalExamMark.getText().equals("")){
                txtFinalExamMark.setText("0");
                JOptionPane.showMessageDialog(this,"Please Enter The Value");
            }
            
    }
    }
    
    
    private void gpaCalculator(){ 
        try{
            
            gpaValue();
            if(GPA[0] >4 || GPA[0]<0){
                gpa_sem1.setText("0");
                JOptionPane.showMessageDialog(this,"Please Enter The Value Between 0 and 4");
            }
            if(GPA[1] >4 || GPA[1]<0){
                gpa_sem2.setText("0");
                JOptionPane.showMessageDialog(this,"Please Enter The Value Between 0 and 4");    
            }
            if(GPA[2] >4 || GPA[2]<0){
                gpa_sem3.setText("0");
                JOptionPane.showMessageDialog(this,"Please Enter The Value Between 0 and 4");    
            }
            if(GPA[3] >4 || GPA[3]<0){
                gpa_sem4.setText("0");
                JOptionPane.showMessageDialog(this,"Please Enter The Value Between 0 and 4");
            }
            if(GPA[4] >4 || GPA[4]<0){
                gpa_sem5.setText("0");
                JOptionPane.showMessageDialog(this,"Please Enter The Value Between 0 and 4");
            }
            if(GPA[5] >4 || GPA[5]<0){
                gpa_sem6.setText("0");
                JOptionPane.showMessageDialog(this,"Please Enter The Value Between 0 and 4");
            }
            if(GPA[6] >4 || GPA[6]<0){
                gpa_sem7.setText("0");
                JOptionPane.showMessageDialog(this,"Please Enter The Value Between 0 and 4");
            }
            if(GPA[7] >4 || GPA[7]<0){
                gpa_sem8.setText("0");
                JOptionPane.showMessageDialog(this,"Please Enter The Value Between 0 and 4");
            }
            if(GPA[8] >4 || GPA[8]<0){
                gpa_sem9.setText("0");
                JOptionPane.showMessageDialog(this,"Please Enter The Value Between 0 and 4");    
            }
            if(GPA[9] >4 || GPA[9]<0){
                gpa_sem10.setText("0");
                JOptionPane.showMessageDialog(this,"Please Enter The Value Between 0 and 4");    
            }
            int sum=0;
            for (int i = 0; i < GPA.length; i++) {
                if(GPA[i] != 0){
                    sum++;
                }
            }
            num_of_sem.setText(Integer.toString(sum));
            
        }catch(Exception e){
            if(gpa_sem1.getText().equals("")){
                gpa_sem1.setText("0");
            }
            if(gpa_sem2.getText().equals("")){
                gpa_sem2.setText("0");
            }
            if(gpa_sem3.getText().equals("")){
                gpa_sem3.setText("0");
            }
            if(gpa_sem4.getText().equals("")){
                gpa_sem4.setText("0");
            }
            if(gpa_sem5.getText().equals("")){
                gpa_sem5.setText("0");
            }
            if(gpa_sem6.getText().equals("")){
                gpa_sem6.setText("0");
            }
            if(gpa_sem7.getText().equals("")){
                gpa_sem7.setText("0");
            }
            if(gpa_sem8.getText().equals("")){
                gpa_sem8.setText("0");
            }
            if(gpa_sem9.getText().equals("")){
                gpa_sem9.setText("0");
            }
            if(gpa_sem10.getText().equals("")){
                gpa_sem10.setText("0");
            }
            JOptionPane.showMessageDialog(this,"Please Enter The Value");
        }
        
    }
    private void gpaValue(){
        GPA[0] = Double.parseDouble(gpa_sem1.getText());
        GPA[1] = Double.parseDouble(gpa_sem2.getText());
        GPA[2] = Double.parseDouble(gpa_sem3.getText());
        GPA[3] = Double.parseDouble(gpa_sem4.getText());
        GPA[4] = Double.parseDouble(gpa_sem5.getText());
        GPA[5] = Double.parseDouble(gpa_sem6.getText());
        GPA[6] = Double.parseDouble(gpa_sem7.getText());
        GPA[7] = Double.parseDouble(gpa_sem8.getText());
        GPA[8] = Double.parseDouble(gpa_sem9.getText());
        GPA[9] = Double.parseDouble(gpa_sem10.getText());
    }
    private void courseValue(){
        Courses[0][0] = "Data Science";
        Courses[0][1] = "1234";
        Courses[0][2] = "3";
        Courses[0][3] = "Dr.Magda";
        Courses[0][4] = "Eng.Hudy";
        
        Courses[1][0] = "Programming 1";
        Courses[1][1] = "1245";
        Courses[1][2] = "3";
        Courses[1][3] = "Dr.Mohamed Kholef";
        Courses[1][4] = "Eng.Hudy";
        
        Courses[2][0] = "Calculus";
        Courses[2][1] = "1256";
        Courses[2][2] = "3";
        Courses[2][3] = "Dr.Gehan";
        Courses[2][4] = "Eng.Ali";
        
        Courses[3][0] = "Linear Algebra";
        Courses[3][1] = "1235";
        Courses[3][2] = "3";
        Courses[3][3] = "Dr.Mohamed Saad";
        Courses[3][4] = "Eng.Nour";
        
        Courses[4][0] = "Introduction to computer Scince";
        Courses[4][1] = "1325";
        Courses[4][2] = "3";
        Courses[4][3] = "Dr.Abeer";
        Courses[4][4] = "Eng.Abdalla";
        
        Courses[5][0] = "Advanced Calculus";
        Courses[5][1] = "1345";
        Courses[5][2] = "3";
        Courses[5][3] = "Dr.Mohamed Walead";
        Courses[5][4] = "Eng.Abdalrhman";
        
        Courses[6][0] = "Data Structures";
        Courses[6][1] = "2345";
        Courses[6][2] = "3";
        Courses[6][3] = "DR.Mohamed elhbrouk";
        Courses[6][4] = "Eng.Shereen";
        
        Courses[7][0] = "Discrete Mathematics";
        Courses[7][1] = "4562";
        Courses[7][2] = "3";
        Courses[7][3] = "Dr.Soha Ahmed";
        Courses[7][4] = "Eng.Fady";
        
        Courses[8][0] = "Innovation";
        Courses[8][1] = "5467";
        Courses[8][2] = "2";
        Courses[8][3] = "Dr.Mohamed Slama";
        Courses[8][4] = "No Lab";
        
        Courses[9][0] = "Probability";
        Courses[9][1] = "6467";
        Courses[9][2] = "3";
        Courses[9][3] = "Dr.Ibrahim";
        Courses[9][4] = "Eng.Shmoa";
        
        Courses[10][0] = "Programming 2";
        Courses[10][1] = "5555";
        Courses[10][2] = "3";
        Courses[10][3] = "Dr.Mohamed";
        Courses[10][4] = "Eng.Aml";
    }
    private void arrayValue(){
        details_of_payment[0]=amount_paid.getText();
        details_of_payment[1]=transaction_number.getText();
        details_of_payment[2]=bank_of_transaction.getText();
        details_of_payment[3]=dot_day.getSelectedItem().toString();
        details_of_payment[4]=dot_month.getSelectedItem().toString();
        details_of_payment[5]=dot_year.getSelectedItem().toString();
        courseValue();
        gpaValue();
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CoursePercentage;
    private javax.swing.JLabel ageValue;
    private javax.swing.JTextField amount_paid;
    private javax.swing.JTextField bank_of_transaction;
    private javax.swing.JButton butAddNew;
    private javax.swing.JButton butDelete;
    private javax.swing.JButton butExit;
    private javax.swing.JButton butRefresh;
    private javax.swing.JButton butReset;
    private javax.swing.JButton butUpdate;
    private javax.swing.JComboBox<String> cboBirthYear;
    private javax.swing.JComboBox<String> cboCurrentCourses;
    private javax.swing.JComboBox<String> cboFaculity;
    private javax.swing.JComboBox<String> cboFinishedCourses;
    private javax.swing.JComboBox<String> cboFinishedInSemester;
    private javax.swing.JComboBox<String> cboGender;
    private javax.swing.JComboBox<String> cboInYear;
    private javax.swing.JComboBox<String> cboNationality;
    private javax.swing.JComboBox<String> cboNumberOfTimeTakingCourse;
    private javax.swing.JComboBox<String> cboTerm;
    private javax.swing.JComboBox<String> cboYear;
    private javax.swing.JLabel courseGrade;
    private javax.swing.JTextField current_hours;
    private javax.swing.JComboBox<String> dot_day;
    private javax.swing.JComboBox<String> dot_month;
    private javax.swing.JComboBox<String> dot_year;
    private javax.swing.JTextField finished_hours;
    private javax.swing.JTextField gpa_sem1;
    private javax.swing.JTextField gpa_sem10;
    private javax.swing.JTextField gpa_sem2;
    private javax.swing.JTextField gpa_sem3;
    private javax.swing.JTextField gpa_sem4;
    private javax.swing.JTextField gpa_sem5;
    private javax.swing.JTextField gpa_sem6;
    private javax.swing.JTextField gpa_sem7;
    private javax.swing.JTextField gpa_sem8;
    private javax.swing.JTextField gpa_sem9;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField maximum_hours;
    private javax.swing.JLabel num_of_sem;
    private javax.swing.JComboBox<String> number_of_payments;
    private javax.swing.JLabel remaining_hours;
    private javax.swing.JTable table;
    private javax.swing.JTextField total_amount_paid;
    private javax.swing.JTextField transaction_number;
    private javax.swing.JTextField txt12thMark;
    private javax.swing.JTextField txt7thMark;
    private javax.swing.JTextField txtAreaName;
    private javax.swing.JTextField txtCityName;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtCourseCodeFinished;
    private javax.swing.JTextField txtCourseCreditHoursCurrent;
    private javax.swing.JTextField txtCourseCreditHoursFinished;
    private javax.swing.JTextField txtCourseGrade;
    private javax.swing.JTextField txtCourseLabTutorNameCurrent;
    private javax.swing.JTextField txtCourseLabTutorNameFinished;
    private javax.swing.JTextField txtCoursePercentage;
    private javax.swing.JTextField txtCourseTurorNameFinished;
    private javax.swing.JTextField txtCourseTutorNameCurrent;
    private javax.swing.JTextField txtCousreCodeCurrent;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFinalExamMark;
    private javax.swing.JTextField txtFlatNum;
    private javax.swing.JTextField txtGovernorateName;
    private javax.swing.JTextField txtHomePhone;
    private javax.swing.JTextField txtHouseNum;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtNumberOfCurrentCourses;
    private javax.swing.JTextField txtNumberOfFinishedCourses;
    private javax.swing.JTextField txtPostalCode;
    private javax.swing.JTextField txtSearchByStudentID;
    private javax.swing.JTextField txtStreetName;
    private javax.swing.JTextField txtTotalNumberOfCreditHoursCurrent;
    private javax.swing.JTextField txtTotalNumberOfCreditHoursFinished;
    private javax.swing.JTextField txtYearWorkMark;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JTextField txtmiddlename;
    private javax.swing.JComboBox<String> type_of_funding;
    // End of variables declaration//GEN-END:variables
}
