package com.dge.utilisateur;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtilisateurConfig {

    /**
     * @param repository
     * @return
     */
    @Bean
    CommandLineRunner commandLineRunner(UtilisateurRepository repository){
        return args->{
            Utilisateur dola=new Utilisateur("dola","maitre@gmail.com","doudou");
            Utilisateur gogo=new Utilisateur("goog","feu","dodo");
            repository.saveAll(
                List.of(dola,gogo)
            );
        };    
    }
}
