package com.spring.codeblog.utils;


import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DummyData {

    @Autowired
    CodeblogRepository codeblogRepository;

    @PostConstruct
    public void savePosts() {
        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Jocimar Neres");
        post1.setData(LocalDate.now());
        post1.setTitulo("AQUECIMENTO GLOBAL");
        post1.setTexto("Mas devo explicar-lhe como nasceu toda essa idéia equivocada de denunciar um prazer e louvar a dor, e lhe darei um relato completo do sistema, expondo os ensinamentos reais do grande explorador da verdade, o mestre-construtor. da felicidade humana. Ninguém rejeita, não gosta, ou evita o prazer em si, porque é prazer, mas porque aqueles que não sabem como buscar prazer encontram racionalmente conseqüências que são extremamente dolorosas. Tampouco há alguém que ame, busque ou deseje obter dor de si mesmo, porque é dor, mas ocasionalmente ocorrem circunstâncias em que a labuta e a dor podem lhe proporcionar um grande prazer. Para dar um exemplo trivial, qual de nós empreende algum exercício físico laborioso, exceto para obter alguma vantagem disso? Mas quem tem o direito de criticar um homem que escolhe desfrutar de um prazer que não tem conseqüências irritantes, ou alguém que evita uma dor que não produz prazer resultante?");

        Post post2 = new Post();
        post2.setAutor("Júlia Almeida");
        post2.setData(LocalDate.now());
        post2.setTitulo("HOSPITAIS DE CAMPANHA");
        post2.setTexto("Por outro lado, denunciamos com justa indignação e antipatia homens que são tão enganados e desmoralizados pelos encantos do prazer do momento, tão cegados pelo desejo, que não podem prever a dor e os problemas que estão fadados a acontecer; e a culpa igual pertence àqueles que falham em seu dever através da fraqueza da vontade, o que é o mesmo que dizer através do encolhimento da labuta e da dor. Esses casos são perfeitamente simples e fáceis de distinguir. Em uma hora livre, quando nosso poder de escolha é desimpedido e quando nada impede que sejamos capazes de fazer o que mais gostamos, todo prazer é para ser bem-vindo e toda dor evitada. Mas, em certas circunstâncias, e devido às reivindicações de dever ou às obrigações dos negócios, freqüentemente ocorrerá que os prazeres devem ser repudiados e os aborrecimentos aceitos. O homem sábio, portanto, sempre se atém a esse princípio de seleção: rejeita os prazeres para assegurar outros prazeres maiores ou tolera dores para evitar dores piores.");

        postList.add(post1);
        postList.add(post2);

        for(Post post: postList){
            Post postSaved = codeblogRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}
