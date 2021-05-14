package com.mmelo.designpatterns;

import com.mmelo.designpatterns.structural.composite.CompanyDirectory;
import com.mmelo.designpatterns.structural.composite.Developer;
import com.mmelo.designpatterns.structural.composite.Manager;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CompositeTests {


    @Test
    void composite() {
        final Developer dev1 = new Developer(100, "Lokesh Sharma", "Pro Developer");
        final Developer dev2 = new Developer(101, "Vinay Sharma", "Developer");
        final CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        final Manager man1 = new Manager(200, "Kushagra Garg", "SEO Manager");
        final Manager man2 = new Manager(201, "Vikram Sharma ", "Kushagra's Manager");
        final CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        final CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.showEmployeeDetails();
    }
}
