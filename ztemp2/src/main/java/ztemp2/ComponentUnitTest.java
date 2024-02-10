package ztemp2;

import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class ComponentUnitTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void givenInScopeComponents_whenSearchingInApplicationContext_thenFindThem() {
        assertNotNull(applicationContext.getBean(ControllerExample.class));
        assertNotNull(applicationContext.getBean(ServiceExample.class));
        assertNotNull(applicationContext.getBean(RepositoryExample.class));
        assertNotNull(applicationContext.getBean(ComponentExample.class));
        assertNotNull(applicationContext.getBean(CustomComponentExample.class));
    }
}