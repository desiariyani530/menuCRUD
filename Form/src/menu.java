
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;




   public class menu extends JFrame {
         
        JLabel lTitle = new JLabel ("Menu Utama");
        JButton btnform = new JButton("1.Input data");
        JButton btnlihat = new JButton("2.Lihat data");
        JButton btnedit = new JButton("3.Edit data");
        JButton btnhapus = new JButton("4.Hapus data");
        
        public void Menuu(){
        setTitle("Menu Data Mhs");
	setDefaultCloseOperation(3);
        setSize(485,320);
        setLocation(700,400);
        setLayout(null);
        
        add(lTitle);
        lTitle.setBounds(155, 20, 500, 50);
     
        add(btnform);
        btnform.setBounds(30, 80, 180, 60);
        add(btnlihat);
        btnlihat.setBounds(250, 80, 180, 60);
        add(btnedit);
        btnedit.setBounds(30, 170, 180, 60);
        add(btnhapus);
        btnhapus.setBounds(250, 170, 180, 60);
               
        setVisible(true);
        
          btnform.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               formmhs mhs= new formmhs();
               mhs.tesformmhs();
            }
            
        });
        
        
        btnlihat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               Lihatdata lihat = new Lihatdata();
               lihat.Lihatdata();
            }
            
        });
        
        btnedit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               EditData edit = new EditData();
               edit.EditData();
            }
            
        });
        
        btnhapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               HapusData hapus = new HapusData();
               hapus.HapusData();
            }
            
        });
    }    
    

}
