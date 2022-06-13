package br.com.cesarschool.projeto;

public class User {

        int id;
        String username;
        String password;
        int resultadoConsultoria;
        boolean avaliado;

        public User(int id, String username, String password) {
                this.id = id;
                this.username = username;
                this.password = password;
                avaliado = false;
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

        public int getResultadoConsultoria() {
                return resultadoConsultoria;
        }

        public boolean isAvaliado() {
                return avaliado;
        }

        public void setResultadoConsultoria(int resultadoConsultoria) {
                this.resultadoConsultoria = resultadoConsultoria;
        }

        public void setAvaliado(boolean avaliado) {
                this.avaliado = avaliado;
        }
}
