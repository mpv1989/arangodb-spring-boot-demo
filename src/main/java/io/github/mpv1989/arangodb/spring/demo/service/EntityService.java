/**
 *
 */
package io.github.mpv1989.arangodb.spring.demo.service;

import java.util.Optional;

import io.github.mpv1989.arangodb.spring.demo.domain.Entity;

/**
 * @author Mark Vollmary
 *
 */
public interface EntityService {

	Entity save(Entity entity);

	Optional<Entity> get(String id);

	void delete(String id);

	Iterable<Entity> getAll();

	Optional<Entity> byName(String name);

}
