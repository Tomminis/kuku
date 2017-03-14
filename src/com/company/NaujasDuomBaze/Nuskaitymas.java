package com.company.NaujasDuomBaze;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Created by Ruta on 2017-03-14.
 */
public class Nuskaitymas {

    private Connection connection;

    public Nuskaitymas() {
        try {

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kcs",
                    "root",
                    "");
        } catch (Exception error) {
            System.out.print(error);
        }
    }


    public void pasisveikink() {
        System.out.println("Hello ");
    }

    public void paklausk() {
        System.out.println("iveskite 1 jei norite trinti ,iveskite 2 jei norite papildyti ");
        System.out.println("pasirinkite 1 ");
        System.out.println("pasirinkite 2 ");
        System.out.println("pasirinkite 3 ");


    }

    public void nuspresk() {
        Scanner sc = new Scanner(System.in);
        int pasirinkimas = sc.nextInt();
        switch (pasirinkimas) {
            case 1:
                lentele1();
                break;
            case 2:
                lentele2();
                break;
            case 3:
                lentele3();
                break;
        }
    }

    public void lentele1() {
        System.out.print("pasirinkote adresai: 1");
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from studentai");
            while (resultSet.next()) {
                System.out.println("/");
                System.out.print(resultSet.getInt("id"));
                System.out.print("/");
                System.out.print(resultSet.getString("name"));
                System.out.print("/");
                System.out.print(resultSet.getString("surname"));
                System.out.print("/");
                System.out.print("/");
            }


        } catch (Exception error) {
            System.out.println(error);

        }
    }

    public void lentele2() {
        System.out.print("pasirinkote adresai: 2");
    }

    public void lentele3() {
        System.out.print("pasirinkote adresai: 3");
    }


}
