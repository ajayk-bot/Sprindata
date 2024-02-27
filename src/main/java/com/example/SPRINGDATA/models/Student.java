package com.example.SPRINGDATA.models;

import com.example.SPRINGDATA.enumsConstant.StudentDepartment;
import com.example.SPRINGDATA.models.Book;
import com.example.SPRINGDATA.models.StudentAddress;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;

    private long studentRollNumber;
    private String studentName;
    private String studentEmail;
    @Enumerated(value = EnumType.STRING)
    private StudentDepartment studentDepartment;
    private String StudentColleageName;

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "bookId")
//    private List<Book> books;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Book",
            joinColumns = @JoinColumn(name = "studentId"),
            inverseJoinColumns = @JoinColumn(name = "bookId")
    )
    private List<Book> books;


    private long studentMarksObtained;
    private long studentNoOfSubjectOpt;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pinCode")
    private StudentAddress address;


}
