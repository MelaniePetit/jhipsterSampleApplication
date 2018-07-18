package io.github.jhipster.firstapplication.repository.search;

import io.github.jhipster.firstapplication.domain.Department;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Department entity.
 */
public interface DepartmentSearchRepository extends ElasticsearchRepository<Department, Long> {
}
