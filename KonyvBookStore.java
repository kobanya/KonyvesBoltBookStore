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
    private int MindenKemiaAr =15;
    private int PitekEsFelfujtakAr= 19;

// az ablak definiálása

    public KonyvBookStore() {
        mindenKemia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            mindenKemiaKep.setVisible(true);
            }
        });
        pitekEsFelfujtakPaulCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            pitekFelfujtakKep.setVisible(true);
            }
        });
        szazJatakHejjasEndreCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SzazJatekKep.setVisible(true);
            }
        });
        nosztalgia40CheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nosztalgia40Kep.setVisible(true);
            }
        });
        mostAkkorJarunkCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostAkkorJarunkKep.setVisible(true);
            }
        });
        aRabbiSzerdanMegazottCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rabbiMegazottKep.setVisible(true);
            }
        });
        szerelmesIrokCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                szerelmeIrokKep.setVisible(true);
            }
        });
        EdesBekaidokiCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                edesBekeidokKep.setVisible(true);
            }
        });
        veganSzakacskonyvCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                veganSzakacskonyvKep.setVisible(true);
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
    }
}