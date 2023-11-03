package org.example;

import org.example.entity.Employee;
import org.example.util.UtilEntity;

import javax.persistence.EntityManager;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EntityManager em = UtilEntity.getEntityManager();
        List<Employee> employees = em.createQuery("select e from Employee e",Employee.class).getResultList();
        System.out.println("------LISTAR TODOS LOS EMPLEADOS-------");
        employees.forEach(System.out::println);

        System.out.println("----BUSCAR UN EMPLEADO----");
        int employeeId=3;
        Employee employee=em.find(Employee.class,employeeId);
        System.out.println("EMPLEADO ENCONTRADO : "+employee);

       /* System.out.println("----CREAR UN EMPLEADO NUEVO ----");
        Employee newemployee= new Employee();
        newemployee.setFirstName("michael");
        newemployee.setPaSurname("jonson");
        newemployee.setMaSurname("brown");
        newemployee.setEmail("mjonsohn@mail.com");
        newemployee.setSalary((double)990000);

        //iniciamos la transaccion a la base de datos del muevo empleado
        em.getTransaction().begin();
        em.persist(newemployee);//se envia el nuevo empleado a la base de datos
        em.getTransaction().commit();

        System.out.println("NUEVO EMPLEADO CREADO: "+newemployee);*/

       /* System.out.println("-----ACTUALIZAR EMPLEADO-----");
        // int employeeId=3;
        Employee employeeToUpdate= em.find(Employee.class,employeeId);
        System.out.println("EMPLEADO A EDITAR : " +employeeToUpdate);

        //employeeToUpdate.setFirstName("Raul");
        //employeeToUpdate.setPaSurname("jerez");
        //employeeToUpdate.setMaSurname("besouri");
        employeeToUpdate.setEmail("raulitojb@mail.com");
        employeeToUpdate.setSalary((double)590000);

        //iniciamos la transaccion a la base de datos del muevo empleado
        em.getTransaction().begin();
        em.merge(employeeToUpdate);//se envia el nuevo empleado a la base de datos
        em.getTransaction().commit();

        System.out.println("EMPLEADO ACTUALIZADO : "+employeeToUpdate);*/

        System.out.println("---ELIMINAR EMPLEADO ----");
        int employeeToDeleteId= 1;
        Employee employeeToDelete=em.find(Employee.class,employeeToDeleteId);
        System.out.println("EMPLEADO A ELIMINAR : "+employeeToDelete);

        em.getTransaction().begin();
        em.remove(employeeToDelete);//se envia el nuevo empleado a la base de datos
        em.getTransaction().commit();
        em.close();

    }
}