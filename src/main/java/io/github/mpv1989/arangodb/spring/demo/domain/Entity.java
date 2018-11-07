/**
 *
 */
package io.github.mpv1989.arangodb.spring.demo.domain;

import org.springframework.data.annotation.Id;

import com.arangodb.springframework.annotation.Document;

import lombok.Data;

/**
 * @author Mark Vollmary
 *
 */
@Data
@Document
public class Entity {

	@Id
	private String id;
	private String name;

}
