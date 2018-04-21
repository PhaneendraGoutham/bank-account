package io.accounts.repository;

import java.util.List;

import io.accounts.domain.Account;
import org.springframework.data.repository.CrudRepository;

import io.accounts.domain.AccountType;

public interface AccountRepository extends CrudRepository<Account,Integer> {
	public List<Account> findByUserid(String userId);
	public List<Account> findByUseridAndType(String userId, AccountType type);
}
