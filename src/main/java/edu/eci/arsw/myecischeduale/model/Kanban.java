package edu.eci.arsw.myecischeduale.model;

<<<<<<< HEAD


import java.util.Date;

=======
>>>>>>> kanban
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
=======
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
>>>>>>> kanban
import javax.persistence.Table;

@Entity
@Table(name = "Kanban")
public class Kanban {
<<<<<<< HEAD

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date creationDate;

    
    public Kanban(Long id, Date creationDate) {
        this.id = id;
        this.creationDate = creationDate;
    }


=======
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "IdCDate", nullable = false)
    private CDate idCDate;

    public Kanban(CDate idCDate) {
        this.idCDate = idCDate;
    }

>>>>>>> kanban
    public Long getId() {
        return id;
    }

<<<<<<< HEAD
=======
    public CDate getIdCDate() {
        return idCDate;
    }
>>>>>>> kanban

    public void setId(Long id) {
        this.id = id;
    }

<<<<<<< HEAD

    public Date getCreationDate() {
        return creationDate;
    }


    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }


    
=======
    public void setIdCDate(CDate idCDate) {
        this.idCDate = idCDate;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
>>>>>>> kanban
}
