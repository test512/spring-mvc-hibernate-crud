springmvc-jpa-crud
--------------------

http://localhost:8080/springmvc-jpa-crud/persons

@Reference:
-------------
<<<<<<< HEAD
http://www.journaldev.com/3531/spring-mvc-hibernate-mysql-integration-crud-example-tutorial



```
<context:property-placeholder location="classpath:database.properties" />

	<jpa:repositories base-package="com.journaldev.spring.repository" />
	
	<!-- DataSource -->
	 <bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
		<property name="driverClassName" value="${mysql.driverClassName}" />
		<property name="url" value="${mysql.url}" />
		<property name="username" value="${mysql.username}" />
		<property name="password" value="${mysql.password}" />
	</bean>
	
	<bean id="jpaVendorAdapter" class="org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter">
        <property name="showSql" value="true"/>
        <property name="generateDdl" value="true"/>
        <property name="database" value="MYSQL"/>
    </bean>
    
    <!-- Session Factory -->
	<bean id="entityManagerFactory" class="org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean">
		<property name="dataSource" ref="dataSource" />
		<property name="jpaVendorAdapter" ref="jpaVendorAdapter"/>
		<property name="packagesToScan" value="com.journaldev.spring.model"/>
	</bean>
    
    <!-- Transaction Manager -->
	<bean id="transactionManager"  class="org.springframework.orm.jpa.JpaTransactionManager">
		<property name="entityManagerFactory" ref="entityManagerFactory" />
	</bean>
	
	<!-- turn on spring transaction annotation -->
	<tx:annotation-driven transaction-manager="transactionManager" />
	```
=======
http://www.journaldev.com/3531/spring-mvc-hibernate-mysql-integration-crud-example-tutorial
>>>>>>> 7e877f78c640bfd076ec4dc9dcc53ce6b992bdc2
