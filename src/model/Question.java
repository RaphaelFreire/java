package model;

/**
 * @author raphaelmachadofreire 
 * Enumerações, Autoboxing e Anotações Uma versão
 * melhorada do "Tomador de Decisões" do Capitulo 9. 
 * Esta versão utiliza uma enum ao invés de váriaveis de interfaces. 
 * Capítulo 12 - Página 267
 */
import java.util.Random;

//Uma enumeração das possiveis respostas
enum Answers {

    NO, YES, MAYBE, LATER, SOON, NEVER
}

class Question4 {

    Random rand = new Random();

    Answers ask() {
    int prob = (int) (100 * rand.nextDouble());

    if (prob < 15)
        return Answers.MAYBE;   //15%
    else if (prob < 30)
        return Answers.NO;      //15%
    else if (prob < 60) 
        return Answers.YES;     //30%
    else if (prob < 75) 
        return Answers.LATER;   //15%
    else if (prob < 98) 
        return Answers.SOON;    //13%
    else 
        return Answers.NEVER;   //2%
    }
}

class AskMe4 {
    static void answer(Answers result) {
        switch (result) {
            case NO:
                System.out.println("Não");
                break;
            case YES:
                System.out.println("Sim");
                break;
            case MAYBE:
                System.out.println("Talvez");
                break;
            case LATER:
                System.out.println("Mais tarde");
                break;
            case SOON:
                System.out.println("logo");
                break;
            case NEVER:
                System.out.println("nunca");
                break;
        }
    }


    public static void main(String args[]) {
        Question4 q = new Question4();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}    