springmvc-hibernate-crud
--------------------------

App URL: http://localhost:8080/springmvc-hibernate-crud/persons


<annotation-driven />
	<context:property-placeholder location="classpath:database.properties" />
	<context:component-scan base-package="com.journaldev.spring" />

	<resources mapping="/resources/**" location="/resources/" />
	
	<tx:annotation-driven transaction-manager="transactionManager"/>
	
	<beans:bean id="transactionManager" class="org.springframework.orm.hibernate4.HibernateTransactionManager">
		<beans:property name="sessionFactory" ref="hibernate4AnnotatedSessionFactory" />
	</beans:bean>

	<beans:bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<beans:property name="prefix" value="/WEB-INF/views/" />
		<beans:property name="suffix" value=".jsp" />
	</beans:bean>

	<beans:bean id="dataSource" class="org.apache.commons.dbcp.BasicDataSource"  destroy-method="close">
		<beans:property name="driverClassName" value="${mysql.driverClassName}" />
		<beans:property name="url" value="${mysql.url}" />
		<beans:property name="username" value="${mysql.username}" />
		<beans:property name="password" value="${mysql.password}" />
	</beans:bean>

	<!-- Hibernate 4 SessionFactory Bean definition -->
	<beans:bean id="hibernate4AnnotatedSessionFactory" class="org.springframework.orm.hibernate4.LocalSessionFactoryBean">
		<beans:property name="dataSource" ref="dataSource" />
		
		<beans:property name="annotatedClasses">
			<beans:list>
				<beans:value>com.journaldev.spring.model.Person</beans:value>
			</beans:list>
		</beans:property>
		
		<beans:property name="hibernateProperties">
			<beans:props>
				<beans:prop key="hibernate.dialect">${mysql.hibernate.dialect}</beans:prop>
				<beans:prop key="hibernate.show_sql">${mysql.hibernate.show_sql}</beans:prop>
			</beans:props>
		</beans:property>
	</beans:bean>

	<!-- Person DAO -->	
	<beans:bean id="personDAO" class="com.journaldev.spring.dao.PersonDAOImpl">
		<beans:property name="sessionFactory" ref="hibernate4AnnotatedSessionFactory" />
	</beans:bean>
	
	<!-- Person Service -->
	<beans:bean id="personService" class="com.journaldev.spring.service.PersonServiceImpl">
		<beans:property name="personDAO" ref="personDAO" />
	</beans:bean>