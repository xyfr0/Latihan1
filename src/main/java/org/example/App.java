package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    static class bidangDuaDimensi{
        private String nama;

        public bidangDuaDimensi(String nama){
            this.nama = nama;
        }

        public void info(){
            System.out.println(nama);
        }

        public void luas(){

        }

        class bujurSangkar extends bidangDuaDimensi {
            private float sisi;

            public bujurSangkar(String nama, float sisi) {
                super(nama);
                this.sisi = sisi;
            }

            @Override
            public void luas() {
                System.out.println(sisi * sisi);
            }
        }

        class lingkaran extends bidangDuaDimensi{
            private float jariJari;

            public lingkaran(String nama, float jariJari) {
                super(nama);
                this.jariJari = jariJari;
            }

            @Override
            public void luas() {
                System.out.println(Math.PI * jariJari * jariJari);
            }
        }
    }
}