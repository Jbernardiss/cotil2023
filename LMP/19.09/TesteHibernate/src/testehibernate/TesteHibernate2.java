/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testehibernate;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtil;

/**
 *
 * @author taniabasso
 */
public class TesteHibernate2 {
    public static void main(String[] args) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        //primeiro cria as disciplinas
        Disciplina disc1 = new Disciplina (1,"java", 80);
        Disciplina disc2 = new Disciplina (2, "estrutura de dados", 40);
        Disciplina disc3 = new Disciplina (3, "banco de dados", 40);
        
        //cria os alunos
        Aluno al1 = new Aluno(1234,"Tania");
        Aluno al2 = new Aluno(5678,"Leandro");
        Aluno al3 = new Aluno(9012,"Maria");

        // cria professores
        Professor prof1 = new Professor(1, "Tania", 2000);
        Professor prof2 = new Professor(2,"Xandão", 1500);

        // cria departamentos
        Departamento dept1 = new Departamento(1, "Exatas");
        Departamento dept2 = new Departamento(2, "Humanas");

        // cria funcionarios
        Funcionario func1 = new Funcionario(1, "David", 15000);
        Funcionario func2 = new Funcionario(2, "Sandro", -10);

        //salva alunos
        session.save(al1);
        session.save(al2);
        session.save(al3);

        //salva disciplinas
        session.save(disc1);
        session.save(disc2);
        session.save(disc3);

        //salva professores
        session.save(prof1);
        session.save(prof2);
        List<Disciplina> listaDisc = new ArrayList<Disciplina>();
        List<Disciplina> listaDiscXandao = new ArrayList<Disciplina>();
        listaDisc.add(disc1);
        listaDisc.add(disc2);
        listaDiscXandao.add(disc3);
        prof1.setListaDisc(listaDisc);
        prof2.setListaDisc(listaDiscXandao);

        //salva departamentos
        session.save(dept1);
        session.save(dept2);

        //salva funcionarios
        session.save(func1);
        session.save(func2);
           
        session.getTransaction().commit();

        String hql = "from Professor";
        Query query = session.createQuery(hql);
        List<Professor> result = query.list();
        for (Professor prof : result) {
            System.out.println(prof.getNome() + " " + prof.getSalario());
        }

        hql = "from Aluno";
        query = session.createQuery(hql);
        List<Aluno> alunoResult = query.list();
        for(Aluno al: alunoResult){
            if(al.getRa() == 1) {
                System.out.println("Aluno 1: " + al.getNome());
            }
        }
        for(Aluno al: alunoResult){
            if(al.getNome().startsWith("a")) {
                System.out.println("Aluno a: " + al.getNome());
            }
        }

        hql = "from Disciplina";
        query = session.createQuery(hql);
        List<Disciplina> discResult = query.list();
        for(Disciplina disc: discResult) {
            if(disc.getCodigo() == 2) {
                System.out.println("#" + disc.getCodigo() + ": " + disc.getDescricao() + ", " + disc.getCargaHoraria() + " horas");
            }
        }
        for(Disciplina disc: discResult) {
            if(disc.getCargaHoraria() < 80) {
                System.out.println("#" + disc.getCodigo() + ": " + disc.getDescricao() + ", " + disc.getCargaHoraria() + " horas");
            }
        }


        session.close();
        HibernateUtil.shutdown();
    }
}
