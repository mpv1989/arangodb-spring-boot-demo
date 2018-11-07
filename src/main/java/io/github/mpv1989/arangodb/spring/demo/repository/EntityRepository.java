/**
 *
 */
package io.github.mpv1989.arangodb.spring.demo.repository;

import java.util.Optional;

import com.arangodb.springframework.repository.ArangoRepository;

import io.github.mpv1989.arangodb.spring.demo.domain.Entity;

/**
 * @author Mark Vollmary
 *
 */
public interface EntityRepository extends ArangoRepository<Entity, String> {

	Optional<Entity> findByName(String name);

}
