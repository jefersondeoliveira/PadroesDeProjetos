package padroesprojetos;

import java.util.ArrayList;
import java.util.List;
import padroesprojetos.bridge.BRelatorio;
import padroesprojetos.bridge.BRelatorioPDF;
import padroesprojetos.bridge.ProcessadorCriptografado;
import padroesprojetos.composite.Produto;
import padroesprojetos.composite.ProdutoComposto;
import padroesprojetos.composite.ProdutoUnico;
import padroesprojetos.factory.Tradutor;
import padroesprojetos.factory.TradutorFactory;
import padroesprojetos.observer.Termometro;
import padroesprojetos.observer.TermometroAnalogico;
import padroesprojetos.singleton.Singleton;
import padroesprojetos.strategy.ForkAndKnifeeStrategy;
import padroesprojetos.strategy.HashiStrategy;
import padroesprojetos.strategy.Human;
import padroesprojetos.template.ExportarCSV;
import padroesprojetos.template.ExportarPdf;
import padroesprojetos.template.Relatorio;

import padroesprojetos.observer.Observable;
import padroesprojetos.state.Agua;
import padroesprojetos.state.Personagem;

public class PadroesProjetos {

    public static void main(String[] args) {
        
        
//        Singleton singleton = Singleton.getInstance();
//        System.out.println(singleton.getData());
//        
//        Singleton singletonSecond = Singleton.getInstance();
//        System.out.println(singletonSecond.getData());
        
//        Human brazilin = new Human(new ForkAndKnifeeStrategy());
//        brazilin.eat();
//        Human japanise = new Human(new HashiStrategy());
//        japanise.eat();
        
//        Relatorio relatorio = new ExportarPdf();
//        relatorio.gerarRelatorio();
//        
//        relatorio = new ExportarCSV();
//        relatorio.gerarRelatorio();
        
//        Tradutor tradutor = null;
//        TradutorFactory tradutorFactory = new TradutorFactory();
//        
//        tradutor = tradutorFactory.getTradutor("jp");
//        tradutor.traduzir("teste");
//        
//        tradutor = tradutorFactory.getTradutor("en");
//        tradutor.traduzir("teste2");
        
//        Termometro termomentro = new Termometro();
//        TermometroAnalogico analogico = new TermometroAnalogico();
//        
//        Observable observable = new Observable();
//        observable.addObserver(analogico);
//        observable.addObserver(termomentro);
//        
//        observable.setTemperatura(5);
//        observable.setTemperatura(1);
//        observable.setTemperatura(6);
        
//        BRelatorio relatorio = new BRelatorioPDF();
//        relatorio.gerarRelatorio();
//        relatorio.setProcessador(new ProcessadorCriptografado());
//        relatorio.gerarRelatorio();
        
//        Personagem personagem = new Personagem();
//        personagem.pressionouA();
//        personagem.pressionouB();
//        personagem.setEstadoPersonagem(new Agua());
//        personagem.pressionouA();
//        personagem.pressionouB();
        
        Produto xebeck = new ProdutoUnico(2.5);
        Produto danoninho = new ProdutoUnico(2.5);
        Produto refrigerante = new ProdutoUnico(5.0);
        Produto carne = new ProdutoUnico(10.0);
        
        List<Produto> produtos = new ArrayList<>();
        produtos.add(xebeck);
        produtos.add(danoninho);
        produtos.add(refrigerante);
        produtos.add(carne);
        
        Produto cesta = new ProdutoComposto(produtos);
        System.out.println(cesta.getPreco());
        
        
         
         
        
    }
}
