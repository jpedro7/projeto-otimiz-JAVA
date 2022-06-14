package src.br.com.cesarschool.projeto.repositorys;

import src.br.com.cesarschool.projeto.entities.User;

public class RepositorioUsers {
        private static final int TAMANHO_MAXIMO = 1000;

        private User[] users;
        private int tamanhoAtual = 0;

        public RepositorioUsers() {
                users = new User[TAMANHO_MAXIMO];
        }

        public boolean login(String username, String password) {
                for (int i = 0; i < users.length; i++) {
                        if (users[i] == null) {
                                return false;
                        }

                        if (username.equals(users[i].getIdentificador())) {
                                if (password.equals(users[i].getPassword())) {
                                        return true;
                                } else {
                                        return false;
                                }
                        }
                }

                return false;
        }

        public boolean cadastrar(int id, String username, String password) {
                if (tamanhoAtual < TAMANHO_MAXIMO) {
                        for (int i = 0; i < users.length; i++) {
                                if (users[i] == null) {
                                        users[i] = new User(id, username, password);
                                        tamanhoAtual++;
                                        return true;
                                }

                                if (username.equals(users[i].getIdentificador())) {
                                        return false;
                                }
                        }
                }

                return false;
        }

        public User getUserByUsername(String username) {
                for (int i = 0; i < users.length; i++) {
                        if (users[i] == null) {
                                return null;
                        } else if (username.equals(users[i].getIdentificador())) {
                                return users[i];
                        }
                }
                return null;
        }
}
