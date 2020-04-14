package rpg;

import rpg.Classes.Personagem;
import rpg.Classes.Arqueiro;
import rpg.Classes.Guerreiro;
import rpg.Classes.Mago;

import rpg.Classes.BotaBronze;
import rpg.Classes.BotaPrata;

public class Game {
    public static void main(String[] args) {
        /*JOGADORES*/
        Guerreiro gustavo = new Guerreiro();
        Arqueiro erick = new Arqueiro();
        Mago alef = new Mago();
        
        /*EQUIPAMENTOS*/
        BotaBronze botaBronze = new BotaBronze();
        BotaPrata botaPrata = new BotaPrata();
        
        /***************PLAY*******************/
        
        
        gustavo.exibirDadosInicialJogador();
        gustavo.lvlUp();
        //gustavo.EquiparBota(botaPrata);
        //gustavo.EquiparBota(botaBronze);
        gustavo.exibirNovosDadosJogador();
        
        
        /*
        erick.exibirDadosInicialJogador();
        //erick.lvlUp();
        erick.EquiparBota(botaPrata);
        //erick.EquiparBota(botaBronze);
        erick.exibirNovosDadosJogador();
        */
        
        /*
        alef.exibirDadosInicialJogador();
        //alef.lvlUp();
        //alef.EquiparBota(botaPrata);
        alef.EquiparBota(botaBronze);
        alef.exibirNovosDadosJogador();
        */
    }
    
}
