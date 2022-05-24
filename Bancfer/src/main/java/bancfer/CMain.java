package bancfer;

import java.util.ArrayList;
import java.util.Scanner;

public class CMain {

    public static void main(String[] args) {
        ArrayList<CCompteBancari> comptes = new ArrayList<CCompteBancari>();
        CPersona[] persones = new CPersona[10];
        Scanner sc = new Scanner(System.in); // Scanner Strings.
        Scanner ic = new Scanner(System.in); // Scanner Integers.
        int comptador = 0; // Comptador.
        int opcio;
        do {
            System.out.println("Escull una opcio: ");
            System.out.println("1.Crear nou compte.");
            System.out.println("2.Modificar compte");
            System.out.println("3.Eliminar compte");
            System.out.println("4.Consultar saldo");
            System.out.println("5.Ingressar");
            System.out.println("6.Extreure");
            System.out.println("7.Modificar numero secret");
            System.out.println("8.Transferencia");
            System.out.println("0.Sortir");
            opcio = ic.nextInt();

            switch (opcio) {
                case 1:
                    String cad1,
                     cad2,
                     cad3;
                    String cad4 = "ex";
                    System.out.println("Nom: ");
                    cad1 = sc.nextLine();
                    System.out.println("Primer cognom: ");
                    cad2 = sc.nextLine();
                    System.out.println("Segon cognom: ");
                    cad3 = sc.nextLine();
                    while (cad4.length() != 4) {
                        System.out.println("Numero secret de 4 digits: ");
                        cad4 = sc.nextLine();
                    }
                    persones[comptador] = new CPersona(cad1, cad2, cad3, Integer.valueOf(cad4));
                    comptes.add(new CCompteBancari(persones[comptador]));
                    System.out.println("Numero de compte generat: " + comptes.get(comptador).getNumero());
                    comptador++;
                    break;
                case 2:
                    int nc,
                     ns;
                    boolean check = false;
                    if (comptador <= 0) {
                        System.out.println("No hi han comptes guardats.");
                    } else {
                        System.out.println("Numero de compte: ");
                        nc = ic.nextInt();
                        for (int i = 0; i < comptador; i++) {
                            if (nc == comptes.get(i).getNumero()) {
                                check = true;
                                System.out.println("Numero secret: ");
                                ns = ic.nextInt();
                                if (comptes.get(i).comprovarNumero(ns, comptes.get(i).getPropietari().getNumero_secret()) == true) {
                                    System.out.println("Escriu el nou nom: ");
                                    comptes.get(i).getPropietari().setNom(sc.nextLine());
                                    System.out.println("Escriu el nou primer cognom: ");
                                    comptes.get(i).getPropietari().setPrimer_cognom(sc.nextLine());
                                    System.out.println("Escriu el nou segon cognom: ");
                                    comptes.get(i).getPropietari().setSegon_cognom(sc.nextLine());
                                    System.out.println("Resultat: " + comptes.get(i).getPropietari().getNom() + " " + comptes.get(i).getPropietari().getPrimer_cognom() + " " + comptes.get(i).getPropietari().getSegon_cognom());
                                } else {
                                    System.out.println("Numero secret incorrecte.");
                                }
                            }
                        }
                        if (check == false) {
                            System.out.println("Numero de compte inexistent.");
                        }
                    }
                    break;
                case 3:
                    int nc0,
                     ns0;
                    boolean check0 = false;
                    if (comptador <= 0) {
                        System.out.println("No hi han comptes guardats.");
                    } else {
                        System.out.println("Numero de compte: ");
                        nc0 = ic.nextInt();
                        for (int i = 0; i < comptador; i++) {
                            if (nc0 == comptes.get(i).getNumero()) {
                                check0 = true;
                                System.out.println("Numero secret: ");
                                ns0 = ic.nextInt();
                                if (comptes.get(i).comprovarNumero(ns0, comptes.get(i).getPropietari().getNumero_secret()) == true) {
                                    comptes.remove(i);
                                    comptador--;
                                } else {
                                    System.out.println("Numero secret incorrecte.");
                                }
                            }
                        }
                        if (check0 == false) {
                            System.out.println("Numero de compte inexistent.");
                        }
                    }
                    break;
                case 4:
                    int nc1,
                     ns1;
                    boolean check1 = false;
                    if (comptador <= 0) {
                        System.out.println("No hi han comptes guardats.");
                    } else {
                        System.out.println("Numero de compte: ");
                        nc1 = ic.nextInt();
                        for (int i = 0; i < comptador; i++) {
                            if (nc1 == comptes.get(i).getNumero()) {
                                check1 = true;
                                System.out.println("Numero secret: ");
                                ns1 = ic.nextInt();
                                if (comptes.get(i).comprovarNumero(ns1, comptes.get(i).getPropietari().getNumero_secret()) == true) {
                                    System.out.println("Saldo: " + comptes.get(i).getSaldo());
                                } else {
                                    System.out.println("Numero secret incorrecte.");
                                }
                            }
                        }
                        if (check1 == false) {
                            System.out.println("Numero de compte inexistent.");
                        }
                    }
                    break;
                case 5:
                    int nc2,
                     ns2,
                     ing2;
                    boolean check2 = false;
                    if (comptador <= 0) {
                        System.out.println("No hi han comptes guardats.");
                    } else {
                        System.out.println("Numero de compte: ");
                        nc2 = ic.nextInt();
                        for (int i = 0; i < comptador; i++) {
                            if (nc2 == comptes.get(i).getNumero()) {
                                check2 = true;
                                System.out.println("Numero secret: ");
                                ns2 = ic.nextInt();
                                if (comptes.get(i).comprovarNumero(ns2, comptes.get(i).getPropietari().getNumero_secret()) == true) {
                                    System.out.println("Saldo actual: " + comptes.get(i).getSaldo() + " Quant vol ingressar?");
                                    ing2 = ic.nextInt();
                                    comptes.get(i).ingressarSaldo(ing2, ns2);
                                    System.out.println("Saldo final: " + comptes.get(i).getSaldo());
                                } else {
                                    System.out.println("Numero secret incorrecte.");
                                }
                            }
                        }
                        if (check2 == false) {
                            System.out.println("Numero de compte inexistent.");
                        }
                    }
                    break;
                case 6:
                    int nc3,
                     ns3,
                     ing3;
                    boolean check3 = false;
                    if (comptador <= 0) {
                        System.out.println("No hi han comptes guardats.");
                    } else {
                        System.out.println("Numero de compte: ");
                        nc3 = ic.nextInt();
                        for (int i = 0; i < comptador; i++) {
                            if (nc3 == comptes.get(i).getNumero()) {
                                check3 = true;
                                System.out.println("Numero secret: ");
                                ns3 = ic.nextInt();
                                if (comptes.get(i).comprovarNumero(ns3, comptes.get(i).getPropietari().getNumero_secret()) == true) {
                                    System.out.println("Saldo actual: " + comptes.get(i).getSaldo() + " Quant vol retirar?");
                                    ing3 = ic.nextInt();
                                    comptes.get(i).extreureSaldo(ing3, ns3);
                                    System.out.println("Saldo final: " + comptes.get(i).getSaldo());
                                } else {
                                    System.out.println("Numero secret incorrecte.");
                                }
                            }
                        }
                        if (check3 == false) {
                            System.out.println("Numero de compte inexistent.");
                        }
                    }
                    break;
                case 7:
                    int nc4,
                     ns4;
                    String cad5 = "ex";
                    boolean check4 = false;
                    if (comptador <= 0) {
                        System.out.println("No hi han comptes guardats.");
                    } else {
                        System.out.println("Numero de compte: ");
                        nc4 = ic.nextInt();
                        for (int i = 0; i < comptador; i++) {
                            if (nc4 == comptes.get(i).getNumero()) {
                                check4 = true;
                                System.out.println("Numero secret: ");
                                ns4 = ic.nextInt();
                                if (comptes.get(i).comprovarNumero(ns4, comptes.get(i).getPropietari().getNumero_secret()) == true) {
                                    while (cad5.length() != 4) {
                                        System.out.println("Nou numero secret de 4 digits: ");
                                        cad5 = sc.nextLine();
                                    }
                                    comptes.get(i).getPropietari().setNumero_secret(Integer.valueOf(cad5));
                                    System.out.println("Perfecte, el nou numero secret es: " + comptes.get(i).getPropietari().getNumero_secret());
                                } else {
                                    System.out.println("Numero secret incorrecte.");
                                }
                            }
                        }
                        if (check4 == false) {
                            System.out.println("Numero de compte inexistent.");
                        }
                    }
                    break;
                case 8:
                    int nc8,ns8,trans,nc9;
                    String cad8 = "ex";
                    boolean check8 = false;
                    if (comptador <= 0) {
                        System.out.println("No hi han comptes guardats.");
                    } else {
                        System.out.println("Numero de compte: ");
                        nc8 = ic.nextInt();
                        for (int i = 0; i < comptador; i++) {
                            if (nc8 == comptes.get(i).getNumero()) {
                                check8 = true;
                                System.out.println("Numero secret: ");
                                ns8 = ic.nextInt();
                                if (comptes.get(i).comprovarNumero(ns8, comptes.get(i).getPropietari().getNumero_secret()) == true) {
                                    System.out.println("Quant vols transferir?");
                                    trans = ic.nextInt();
                                    System.out.println("A quin compte vols transferir diners?");
                                    nc9 = ic.nextInt();
                                    comptes.get(i).setSaldo(comptes.get(i).getSaldo()-trans);
                                    for(int j = 0; j <comptador; j++){
                                       if (nc9 == comptes.get(j).getNumero()) {
                                           comptes.get(j).setSaldo(comptes.get(j).getSaldo()+trans);
                                       }
                                    }
                                } else {
                                    System.out.println("Numero secret incorrecte.");
                                }
                            }
                        }
                        if (check8 == false) {
                            System.out.println("Numero de compte inexistent.");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Adeu!");
                    break;
                default:
                    System.out.println("Opcio invalida.");
                    break;
            }

        } while (opcio != 0);
        sc.close();
        ic.close();
    }
}
