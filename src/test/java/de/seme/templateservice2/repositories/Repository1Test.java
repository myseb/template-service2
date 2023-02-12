package de.seme.templateservice2.repositories;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import de.seme.templateservice2.entities.Entity1;

@DataJpaTest
public class Repository1Test {
	@Autowired
	private Repository1 repository1;
	
	@Test
	public void testFindAll()
	{
		Entity1 entity1 = new Entity1();
		entity1.setValue("ein Test");
		repository1.save(entity1);
		List<Entity1> entities = repository1.findAll();
		assertThat(entities).size().isEqualTo(1);
		assertThat(entities.get(0).getValue()).isEqualTo("ein Test");
	}
}
