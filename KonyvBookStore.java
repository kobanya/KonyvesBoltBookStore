import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KonyvBookStore {

    private Container web;
    private JPanel alapPanel;
    private JPanel konyvLista;
    private JCheckBox mindenKemia;
    private JLabel hasznaltKonyvekDarabszama;
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
    private JLabel a0€Label;
    private JButton ujravalasztasTorles;
    private JLabel ujKonyvekDarabszamaOsszesen;
    private int MindenKemiaAr=0;
    private int PitekEsFelfujtakAr=0;
    private int rabbiMegazottAr=0;
    private int ujosszesenAr=0;
    private int  regiOsszesenAr=0;
    private int pitekFelfujtakAr=0;
    private int veganAr=0;
    private int bekaidokAr=0;
    private int szerelmesIrokAr=0;
    private int szazJatekAr=0;
    private int  nosztalgiaAr=0;
    private int  mostJarunk=0;

// az ablak definiálása

    public KonyvBookStore() {
        mindenKemia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            MindenKemiaAr=15;
            mindenKemiaKep.setVisible(true);
            ujraszamol();
            }
        });
        pitekEsFelfujtakPaulCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            pitekFelfujtakKep.setVisible(true);
            pitekFelfujtakAr=19;
            ujraszamol();
            }
        });
        szazJatakHejjasEndreCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SzazJatekKep.setVisible(true);
                szazJatekAr=10;
                ujraszamol();
            }
        });
        nosztalgia40CheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nosztalgia40Kep.setVisible(true);
                nosztalgiaAr=15;
                ujraszamol();
            }
        });
        mostAkkorJarunkCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostAkkorJarunkKep.setVisible(true);
                mostJarunk=20;
                ujraszamol();
            }
        });
        aRabbiSzerdanMegazottCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rabbiMegazottAr=15;
                rabbiMegazottKep.setVisible(true);
                ujraszamol();
            }
        });
        szerelmesIrokCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                szerelmeIrokKep.setVisible(true);
                szerelmesIrokAr=17;
                ujraszamol();
            }
        });
        EdesBekaidokiCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                edesBekeidokKep.setVisible(true);
                bekaidokAr=19;
                ujraszamol();
            }
        });
        veganSzakacskonyvCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                veganSzakacskonyvKep.setVisible(true);
                veganAr=22;
                ujraszamol();
            }
        });
        ujravalasztasTorles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ujValasztas();
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





    }
    void ujraszamol() {
        ujosszesenAr=MindenKemiaAr+pitekFelfujtakAr+veganAr+bekaidokAr+szerelmesIrokAr;
        ujKonyvekAraOsszesen.setText(ujosszesenAr+" €");
        regiOsszesenAr= rabbiMegazottAr+nosztalgiaAr+szazJatekAr+mostJarunk;
        hasznaltKonyvekAraOsszesen.setText(regiOsszesenAr+" €");
    }
}