package io.datajek.databaserelationships.manytomany.bi;

import io.datajek.databaserelationships.manytomany.bi.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
