public class Ptp {
    public String jogo(int jogador, int pc) {
        if (jogador == pc) {
            return "EMPATOU - jogue novamente";
        } else if (jogador == 1 && pc == 2) {
            return "Pedra(você) quebra Tesoura(pc) --Você ganhou!!";
        } else if (jogador == 1 && pc == 3) {
            return "Papel(pc) embrulha Pedra(você) -- Você perdeu!!";
        } else if (jogador == 2 && pc == 1) {
            return "Pedra(pc) quebra Tesoura(você) -- Você perdeu !!";
        } else if (jogador == 2 && pc == 3) {
            return "Tesoura(você) corta Papel(pc) -- Você ganhou!!";
        } else if (jogador == 3 && pc == 1) {
            return "Papel(você) embrulha Pedra(pc) -- Você ganhou!!";
        } else {
            return "Tesoura(pc) corta Papel(você) -- Você perdeu!!";
        }
    }
}
