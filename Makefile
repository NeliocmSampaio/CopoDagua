run: Main

Main: Main.class AbstractBaralho.class AbstractFabricaDeBaralho.class BaralhoDeCopoDagua.class Carta.class FabricaDeBaralhoCopoDagua.class Cpu.class Jogador.class Player.class AbstractJogo.class Dealer.class Jogo.class DoubleIdentifiedObject.class
	java principal/Main

Main.class: principal/Main.java
	javac principal/Main.java

AbstractBaralho.class: baralho/AbstractBaralho.java
	javac baralho/AbstractBaralho.java

AbstractFabricaDeBaralho.class: baralho/AbstractFabricaDeBaralho.java
	javac baralho/AbstractFabricaDeBaralho.java
	
BaralhoDeCopoDagua.class: baralho/BaralhoDeCopoDagua.java
	javac baralho/BaralhoDeCopoDagua.java
	
Carta.class: baralho/Carta.java
	javac baralho/Carta.java
	
FabricaDeBaralhoCopoDagua.class: baralho/FabricaDeBaralhoCopoDagua.java
	javac baralho/FabricaDeBaralhoCopoDagua.java
	
Cpu.class: jogador/Cpu.java
	javac jogador/Cpu.java
	
Jogador.class: jogador/Jogador.java
	javac jogador/Jogador.java
	
Player.class: jogador/Player.java
	javac jogador/Player.java
	
AbstractJogo.class: jogo/AbstractJogo.java
	javac jogo/AbstractJogo.java

Dealer.class: jogo/Dealer.java
	javac jogo/Dealer.java
	
Jogo.class: jogo/Jogo.java
	javac jogo/Jogo.java
	
DoubleIdentifiedObject.class: jogo/DoubleIdentifiedObject.java
	javac jogo/DoubleIdentifiedObject.java
	
	
	
	
	
	
	
	
	
Imovel.class: tabuleiro/Imovel.java
	javac tabuleiro/Imovel.java

Jogador.class: jogador/Jogador.java
	javac jogador/Jogador.java

Jogo.class: Execucao/Jogo.java
	javac Execucao/Jogo.java
