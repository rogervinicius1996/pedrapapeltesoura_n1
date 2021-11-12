public class Ptp {
    public String jogo(int jogador, int pc){
        if (jogador == pc){
            return "EMPATOU - jogue novamente";
        }    
        else if (jogador == 1 && pc == 2){
            return "Pedra quebra Tesoura --Você ganhou!!";
        }
        else if (jogador == 1 && pc == 3){
            return "Papel embrulha Pedra -- Você perdeu!!";
        }
        else if (jogador == 2 && pc == 1 ){
            return "Pedra quebra Tesoura -- Você perdeu !!";
        }
        else if (jogador ==2 && pc == 3){
            return "Tesoura corta Papel -- Você ganhou!!";
        }
        else if (jogador == 3 && pc == 1){
            return "Papel embrulha Pedra -- Você ganhou!!";
        }
        else {
            return "Tesoura corta Papel -- Você perdeu!!";
        }
    }
}
