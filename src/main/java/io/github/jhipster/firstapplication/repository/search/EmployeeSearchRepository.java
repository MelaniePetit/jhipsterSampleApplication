package io.github.jhipster.firstapplication.repository.search;

import io.github.jhipster.firstapplication.domain.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Employee entity.
 */
public interface EmployeeSearchRepository extends ElasticsearchRepository<Employee, Long> {
}
