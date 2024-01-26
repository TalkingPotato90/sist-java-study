package kr.co.sist.memo;

import javax.swing.*;

public class StudentCard extends JFrame {

    public StudentCard(){
        super("숙제");

        JLabel jlName = new JLabel("이름");
        JTextField jtfName = new JTextField();
        JLabel jlAge = new JLabel("나이");
        JLabel jlGender = new JLabel("성별");
        JLabel jlPhone = new JLabel("전화번호");
        JTextField jtfPhone = new JTextField();

        DefaultComboBoxModel<Integer> dcbm = new DefaultComboBoxModel<Integer>();
        JComboBox<Integer> jcbAge = new JComboBox<Integer>(dcbm);
        JPanel jp = new JPanel();

        for (int i = 20; i < 41; i++) {
        dcbm.addElement(i);
        }

        JButton jbtnAdd = new JButton("추가");
        JButton jbtnEdit = new JButton("변경");
        JButton jbtnDelete = new JButton("삭제");
        JButton jbtnExit = new JButton("종료");

        setLayout(null);
        jbtnAdd.setBounds(60,230,60,25);
        jbtnEdit.setBounds(130,230,60,25);
        jbtnDelete.setBounds(200,230,60,25);
        jbtnExit.setBounds(270,230,60,25);

        add(jbtnAdd);
        add(jbtnEdit);
        add(jbtnDelete);
        add(jbtnExit);

        JRadioButton jbMale = new JRadioButton("남");
        JRadioButton jbFemale = new JRadioButton("여",true);

        ButtonGroup genderGroup =new ButtonGroup();
        genderGroup.add(jbMale);
        genderGroup.add(jbFemale);

        jlName.setBounds(30,30,30,25);
        jtfName.setBounds(60,30,100,25);
        jlAge.setBounds(30,70,30,30);
        jp.setBounds(60,65,60,30);
        jlGender.setBounds(30,110,30,30);
        jbMale.setBounds(60,110,50,30);
        jbFemale.setBounds(120,110,50,30);
        jlPhone.setBounds(30,150,50,30);
        jtfPhone.setBounds(90,155,100,25);

        add(jlName);
        add(jtfName);
        add(jlAge);
        jp.add(jcbAge);
        add(jp);
        add(jlGender);
        add(jbMale);
        add(jbFemale);
        add(jlPhone);
        add(jtfPhone);

        DefaultListModel<String> dlm = new DefaultListModel<String>();

        JList<String> jlStudent = new JList<String>(dlm);

        dlm.addElement("1, 진수현, 남, 010-1234-5678");
        dlm.addElement("2, 김동섭, 남, 010-2345-6789");

        JScrollPane jsp = new JScrollPane(jlStudent);

        jsp.setBounds(210,15,140,180);

        add(jsp);



        setBounds(500,100,400,320);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
