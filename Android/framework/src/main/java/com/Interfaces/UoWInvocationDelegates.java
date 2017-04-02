package com.Interfaces;

import com.domain.DomainObjectInterfaces.IDomainObject;

import java.util.Hashtable;

/**
 * Created by aiko on 4/1/17.
 */

public interface UoWInvocationDelegates {
    Hashtable GetResults();

    void SetResults(Hashtable results);

    void SuccessfulUoWInvocationDelegate(IDomainObject domainObject, UnitOfWorkAction action);

    void FailedUoWInvocationDelegate(IDomainObject domainObject, UnitOfWorkAction action);
}
