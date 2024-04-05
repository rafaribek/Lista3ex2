package br.cesul;

public class Election {
        private int votosCandidatoA;
        private int votosCandidatoB;
        private int votosBrancos;
        private int votosNulos;

        public Election() {
            this.votosCandidatoA = 0;
            this.votosCandidatoB = 0;
            this.votosBrancos = 0;
            this.votosNulos = 0;
        }


        public void votarCandidatoA() {
            this.votosCandidatoA++;
        }

        public void votarCandidatoB() {
            this.votosCandidatoB++;
        }


        public void votarBranco() {
            this.votosBrancos++;
        }


        public void votarNulo() {
            this.votosNulos++;
        }

        public String apurarResultado() {
            int totalVotosValidos = votosCandidatoA + votosCandidatoB;
            int totalVotos = totalVotosValidos + votosBrancos + votosNulos;

            if (totalVotos == 0) {
                return "Não houve votos registrados.";
            }

            double percentualVotosBrancos = (double) votosBrancos / totalVotos;
            double percentualVotosNulos = (double) votosNulos / totalVotos;
            double percentualVotosCandidatoA = (double) votosCandidatoA / totalVotos;
            double percentualVotosCandidatoB = (double) votosCandidatoB / totalVotos;

            if (percentualVotosCandidatoA < 0.5 && percentualVotosCandidatoB < 0.5) {
                return "Segundo Turno";
            }

            if (percentualVotosCandidatoA > percentualVotosCandidatoB) {
                return "Candidato A";
            } else if (percentualVotosCandidatoB > percentualVotosCandidatoA) {
                return "Candidato B";
            } else {
                return "Empate";
            }
        }

        public int getVotosCandidatoA() {
            return votosCandidatoA;
        }

        public int getVotosCandidatoB() {
            return votosCandidatoB;
        }

        public int getVotosBrancos() {
            return votosBrancos;
        }

        public int getVotosNulos() {
            return votosNulos;
        }
}

