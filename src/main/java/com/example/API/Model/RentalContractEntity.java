//package com.example.API.Model;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.io.Serializable;
//import java.util.List;
//
//import static jakarta.persistence.FetchType.LAZY;
//
//@Data
//@Entity
//@Getter
//@Setter
//@Table(name = "RentalContracts")
//@AllArgsConstructor
//
//
//@ToString
//public class RentalContractEntity implements Serializable {
//
//    @Setter
//    @Getter
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Setter
//    @Getter
//    @Column(name = "tenant")
//    private String tenant;
//    @Setter
//    @Getter
//    @Column(name = "monthlyRent")
//    private Double monthlyRent;
//
//
//
//    @OneToMany(mappedBy = "RentalContract",cascade = CascadeType.ALL, fetch = LAZY)
//    @JoinColumn(name = "RentalContractId")
//    private List<PropertyEntity> Properties;
//
//
//public RentalContractEntity (){
//
//}
//    public RentalContractEntity (Long id, PropertyEntity property, OwnerEntity owner) {
//        this.id = id;
//        this.tenant = tenant;
//
//
//    }
//@EmbeddedId
//    private LigneRentContractKey Id;
//}
