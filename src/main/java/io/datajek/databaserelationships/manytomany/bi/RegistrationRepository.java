package io.datajek.databaserelationships.manytomany.bi;

import io.datajek.databaserelationships.manytomany.bi.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration,Integer> {
}
