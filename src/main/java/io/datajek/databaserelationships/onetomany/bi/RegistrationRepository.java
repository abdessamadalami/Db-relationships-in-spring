package io.datajek.databaserelationships.onetomany.bi;

import io.datajek.databaserelationships.onetomany.bi.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration,Integer> {
}
