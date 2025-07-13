package com.example.blog_api.repositories;

import com.example.blog_api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

}

/*
IMP: Here in Repository we are not creating any implementation class of this interface,
then how @Autowired is using UserRepo?
Answer: Spring container will dynamically create its implementation class at Runtime,
class name = jdk.proxy2.$Proxy99, this will be the implementation class of UserRepo
package name = jdk.proxy2

Explanation:  When spring container starts at that time it scans over the all repository interfaces,
and at Runtime spring container gives the implementation to those repository interfaces and
that implementation classes we called as Proxy classes. So, spring creates its object and when we do
Autowired at that time this object is injected in userRepo variable in this case.

 */
