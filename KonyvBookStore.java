import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class KonyvBookStore {

    private Container web;
    private JPanel alapPanel;
    private JPanel konyvLista;
    private JCheckBox mindenKemia;
    private JCheckBox pitekEsFelfujtakPaulCheckBox;
    private JPanel kosarPanel;
    private JLabel mindenKemiaKep;
    private JLabel pitekFelfujtakKep;
    private JCheckBox szazJatakHejjasEndreCheckBox;
    private JLabel SzazJatekKep;
    private JCheckBox nosztalgia40CheckBox;
    private JLabel nosztalgia40Kep;
    private JCheckBox mostAkkorJarunkCheckBox;
    private JLabel mostAkkorJarunkKep;
    private JCheckBox aRabbiSzerdanMegazottCheckBox;
    private JLabel rabbiMegazottKep;
    private JCheckBox szerelmesIrokCheckBox;
    private JLabel szerelmeIrokKep;
    private JCheckBox EdesBekaidokiCheckBox;
    private JLabel edesBekeidokKep;
    private JCheckBox veganSzakacskonyvCheckBox;
    private JLabel veganSzakacskonyvKep;
    private JLabel ujKonyvekAraOsszesen;
    private JLabel hasznaltKonyvekAraOsszesen;
    private JButton ujravalasztasTorles;
    private JLabel vipKedvezmenyOsszeg;
    private JLabel VipKedvezmeny;
    private JLabel egyebKedvezményVIPDiscountLabel;
    private JLabel egyebKedvezmeny;
    private JPanel totalPanel;
    private JLabel totalFizetendo;
    private JRadioButton VIPradioButton;
    private JCheckBox beaKonyhajaCheckBox;
    private JLabel beaKonyhajaKepL;
    private JCheckBox végeCheckBox;
    private int MindenKemiaAr=0;
    private int PitekEsFelfujtakAr=0;
    private int rabbiMegazottAr=0;
    private double ujosszesenAr=0;
    private double  regiOsszesenAr=0;
    private int pitekFelfujtakAr=0;
    private int veganAr=0;
    private int bekaidokAr=0;
    private int szerelmesIrokAr=0;
    private int szazJatekAr=0;
    private int  nosztalgiaAr=0;
    private int  mostJarunk=0;
    private int beaKonyhajaAr=0;
    private  double barki50felettUjat=0;
    private  double vipKedvezmenyOsszegeValtozo=0;
    private static final DecimalFormat df = new DecimalFormat("0.0");



// az ablak definiálása

    public KonyvBookStore() {
// rejtett kedvezmény feliratok
        vipKedvezmenyOsszeg.setVisible(false);
        VipKedvezmeny.setVisible(false);
// könyvlista
        mindenKemia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            MindenKemiaAr=15;
            mindenKemiaKep.setVisible(true);
            ujraszamol();
            vipKartya();
            ujKonyv50Felett();
            }
        });
        pitekEsFelfujtakPaulCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            pitekFelfujtakKep.setVisible(true);
            pitekFelfujtakAr=19;
            ujraszamol();
            vipKartya();
            ujKonyv50Felett();
            }
        });
        szazJatakHejjasEndreCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SzazJatekKep.setVisible(true);
                szazJatekAr=10;
                ujraszamol();
                vipKartya();
                ujKonyv50Felett();
            }
        });
        nosztalgia40CheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nosztalgia40Kep.setVisible(true);
                nosztalgiaAr=15;
                ujraszamol();
                vipKartya();
                ujKonyv50Felett();
            }
        });
        mostAkkorJarunkCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostAkkorJarunkKep.setVisible(true);
                mostJarunk=20;
                ujraszamol();
                vipKartya();
                ujKonyv50Felett();
            }
        });
        aRabbiSzerdanMegazottCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rabbiMegazottAr=15;
                rabbiMegazottKep.setVisible(true);
                ujraszamol();
                vipKartya();
                ujKonyv50Felett();
            }
        });
        szerelmesIrokCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                szerelmeIrokKep.setVisible(true);
                szerelmesIrokAr=17;
                ujraszamol();
                vipKartya();
                ujKonyv50Felett();
            }
        });
        EdesBekaidokiCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                edesBekeidokKep.setVisible(true);
                bekaidokAr=19;
                ujraszamol();
                vipKartya();
                ujKonyv50Felett();
            }
        });
        veganSzakacskonyvCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                veganSzakacskonyvKep.setVisible(true);
                veganAr=22;
                ujraszamol();
                vipKartya();
                ujKonyv50Felett();
            }
        });
        ujravalasztasTorles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ujValasztas();
            }
        });

        VIPradioButton.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                vipKartya();
            }
        });
        beaKonyhajaCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                beaKonyhajaAr=9;

                if(beaKonyhajaCheckBox.isSelected()== true) {
                    beaKonyhajaKepL.setVisible(true);
                }
                else if(beaKonyhajaCheckBox.isSelected()== false) {
                    beaKonyhajaKepL.setVisible(false);
                    beaKonyhajaAr = 0;
                }
            vipKartya();
            ujraszamol();

            }
        });
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Könyvesbolt / Book store");
        frame.setContentPane(new KonyvBookStore().alapPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

// az ablak megnyitása a monitor közepén

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
        frame.setVisible(true);



    }

    void ujValasztas(){
        // pipák törlése
        mindenKemia.setSelected(false);
        aRabbiSzerdanMegazottCheckBox.setSelected(false);
        veganSzakacskonyvCheckBox.setSelected(false);
        EdesBekaidokiCheckBox.setSelected(false);
        szerelmesIrokCheckBox.setSelected(false);
        pitekEsFelfujtakPaulCheckBox.setSelected(false);
        mostAkkorJarunkCheckBox.setSelected(false);
        nosztalgia40CheckBox.setSelected(false);
        szazJatakHejjasEndreCheckBox.setSelected(false);
        beaKonyhajaCheckBox.setSelected(false);

        VIPradioButton.setSelected(false);
        // képek törlése
        mindenKemiaKep.setVisible(false);
        rabbiMegazottKep.setVisible(false);
        veganSzakacskonyvKep.setVisible(false);
        edesBekeidokKep.setVisible(false);
        szerelmeIrokKep.setVisible(false);
        pitekFelfujtakKep.setVisible(false);
        mostAkkorJarunkKep.setVisible(false);
        nosztalgia40Kep.setVisible(false);
        SzazJatekKep.setVisible(false);
        beaKonyhajaKepL.setVisible(false);
        vipKedvezmenyOsszeg.setVisible(false);
        VipKedvezmeny.setVisible(false);
        // összegek törlése
        ujKonyvekAraOsszesen.setText("0 €");
        hasznaltKonyvekAraOsszesen.setText("0 €");
        // valtozok törlése
        ujosszesenAr=0;
        bekaidokAr=0;
        veganAr=0;
        MindenKemiaAr=0;
        szerelmesIrokAr=0;
        rabbiMegazottAr=0;
        pitekFelfujtakAr=0;
        szazJatekAr=0;
        nosztalgiaAr=0;
        mostJarunk=0;
        beaKonyhajaAr=0;
        barki50felettUjat=0;





    }
    void ujraszamol() {
        // uj könyvek ára összesen
        ujosszesenAr=MindenKemiaAr+pitekFelfujtakAr+veganAr+bekaidokAr+szerelmesIrokAr;
        ujKonyvekAraOsszesen.setText(ujosszesenAr+" €");
        //Régi könyvek ára összesen
        regiOsszesenAr= rabbiMegazottAr+nosztalgiaAr+szazJatekAr+mostJarunk+beaKonyhajaAr;
        hasznaltKonyvekAraOsszesen.setText(regiOsszesenAr+" €");

    }

    void vipKartya () {
        if (VIPradioButton.isSelected()) {
            vipKedvezmenyOsszegeValtozo = ujosszesenAr * 0.1 ;
            vipKedvezmenyOsszeg.setText("-" + df.format(vipKedvezmenyOsszegeValtozo) + " €");
            vipKedvezmenyOsszeg.setVisible(true);
            VipKedvezmeny.setVisible(true);
            ujraszamol();
            ujKonyv50Felett();
        } else if (!VIPradioButton.isSelected()) {
            VipKedvezmeny.setVisible(false);
            vipKedvezmenyOsszeg.setVisible(false);
            vipKedvezmenyOsszegeValtozo = 0;
            ujraszamol();
            ujKonyv50Felett();
        }


    }

    void ujKonyv50Felett() {
        // nincs VIP kártya és az Újkönyv ára 50 € felett van
          if (!VIPradioButton.isSelected() && ujosszesenAr > 50) {
              barki50felettUjat = ujosszesenAr * 0.1;
              egyebKedvezmeny.setText("- " + df.format(barki50felettUjat) + "0€");
          }
          else if (VIPradioButton.isSelected() && ujosszesenAr> 50)  {
               barki50felettUjat=ujosszesenAr * 0.15;
               vipKedvezmenyOsszeg.setText("- " + df.format(barki50felettUjat) + "0€");
               vipKedvezmenyOsszeg.setVisible(true);
               VipKedvezmeny.setVisible(true);
               egyebKedvezmeny.setText("0 €");
          }

    }

}