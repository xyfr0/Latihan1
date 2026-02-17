package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    static class bidangDuaDimensi{
        private String nama; //atribut class bidangDuaDimensi

        public bidangDuaDimensi(String nama){
            this.nama = nama;
        } //constructor

        public void info(){
            System.out.println(nama);
        }

        public void luas(){

        }

        //child class dari class bidangDuaDimensi
        class bujurSangkar extends bidangDuaDimensi {
            private float sisi; //atribut class bujurSangkar

            //constructor
            public bujurSangkar(String nama, float sisi) {
                super(nama);
                this.sisi = sisi;
            }

            //overriding method yang sama dari parent class
            @Override
            public void luas() {
                System.out.println(sisi * sisi);
            }
        }

        //child class dari class bidangDuaDimensi
        class lingkaran extends bidangDuaDimensi{
            private float jariJari; //atribut class lingkaran

            //constructor
            public lingkaran(String nama, float jariJari) {
                super(nama);
                this.jariJari = jariJari;
            }

            //overriding method yang sama dari parent class
            @Override
            public void luas() {
                System.out.println(Math.PI * jariJari * jariJari);
            }
        }
    }
}