package src.br.com.cesarschool.projeto.entities;

import src.br.com.cesarschool.projeto.utils.Identificavel;

public class User extends Identificavel {

        private int id;
        private String username;
        private String password;
        private Consultoria consultoria;

        public User(int id, String username, String password) {
                this.id = id;
                this.username = username;
                this.password = password;
                this.consultoria = new Consultoria();
        }

        public int getId() {
                return id;
        }

        public String getUsername() {
                return username;
        }

        public String getPassword() {
                return password;
        }

        public Consultoria getConsultoria() {
                return consultoria;
        }

        public void setConsultoria(Consultoria consultoria) {
                this.consultoria = consultoria;
        }

        @Override
        public String getIdentificador() {
                return "" + this.username;
        }
}
