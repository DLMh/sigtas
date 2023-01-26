Create table Taxe_payer
(
    Taxe_payer_no int NOT NULL,
    NomEtudiant VARCHAR(50),
    PRIMARY KEY(idEtudiant)
);

Create table Document
(
    idMatiere int NOT NULL,
    NomMatiere VARCHAR(20),
    Coefficient int NOT NULL,
    Type_resultat VARCHAR(20),
    PRIMARY KEY(idMatiere)
);

Create table Assement
(
    idEtudiant int NOT NULL,
    idMatiere int NOT NULL,
    daty Date,
    noteparmatiere int,
    FOREIGN KEY (idMatiere) REFERENCES Matiere(idMatiere),
    FOREIGN KEY (idEtudiant) REFERENCES Etudiant(idEtudiant)
);

Create table Entreprise
(
    idEtudiant int NOT NULL,
    idMatiere int NOT NULL,
    daty Date,
    noteparmatiere int,
    FOREIGN KEY (idMatiere) REFERENCES Matiere(idMatiere),
    FOREIGN KEY (idEtudiant) REFERENCES Etudiant(idEtudiant)
);

Create table Tax_transaction
(
    idEtudiant int NOT NULL,
    idMatiere int NOT NULL,
    daty Date,
    noteparmatiere int,
    FOREIGN KEY (idMatiere) REFERENCES Matiere(idMatiere),
    FOREIGN KEY (idEtudiant) REFERENCES Etudiant(idEtudiant)
);
Create table Tax_sub_trans
(
    idEtudiant int NOT NULL,
    idMatiere int NOT NULL,
    daty Date,
    noteparmatiere int,
    FOREIGN KEY (idMatiere) REFERENCES Matiere(idMatiere),
    FOREIGN KEY (idEtudiant) REFERENCES Etudiant(idEtudiant)
);
Create table Tax_payment_type
(
    idEtudiant int NOT NULL,
    idMatiere int NOT NULL,
    daty Date,
    noteparmatiere int,
    FOREIGN KEY (idMatiere) REFERENCES Matiere(idMatiere),
    FOREIGN KEY (idEtudiant) REFERENCES Etudiant(idEtudiant)
);


Create Sequence etu;
select etu.nextval from dual;
insert into Etudiant values(etu.currval,'Bolo');