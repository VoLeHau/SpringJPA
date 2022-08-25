package com.example.springjpa;

import Entity.Address;
import Entity.City;
import Entity.Country;
import Entity.Customer;
import Repository.AddressRepository;
import Repository.CityRepository;
import Repository.CountryRepository;
import Repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootTest(classes = SpringJpaApplication.class)
@EnableAutoConfiguration
@ComponentScan
@Configuration
class SpringJpaApplicationTests {

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    CityRepository cityRepository;
    @Autowired
    CountryRepository countryRepository;

    Country country;
    City city1;
    City city2;
    Address address1;
    Address address2;
    Customer customer1;
    Customer customer2;
//    @Before
//    public void setUp() throws Exception {
//        country = new Country("Viet Nam");
//        city1 = new City("Ho Chi Minh City",country);
//        city2 = new City("Soc Trang",country);
//
//        address1 = new Address("Duong Thi Muoi","Dong Bac","aaaa","12","123","0399121188",city1);
//        address2 = new Address("DI96","Pham Hung","bbbb","Long Phu","789","0399121199",city2);
//
//        customer1 = new Customer("Hau", "Vo Le","hau@gmail.com",address1);
//        customer2 = new Customer("Giau", "Duong Thi Thuy", "giau@gmail.com",address2);
//
//    }

    @Test
    public void test() {
        country = new Country();
        countryRepository.save(country);
//        cityRepository.save(city1);
//        cityRepository.save(city2);
//        addressRepository.save(address1);
//        addressRepository.save(address2);
//
//        customerRepository.save(customer1);
//        customerRepository.save(customer2);
    }
}
