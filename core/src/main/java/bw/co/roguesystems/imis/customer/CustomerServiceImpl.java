// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.roguesystems.imis::customer::CustomerService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.imis.customer;

import bw.co.roguesystems.imis.PropertySearchOrder;
import bw.co.roguesystems.imis.SearchObject;
import java.util.Collection;
import java.util.Set;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.imis.customer.CustomerService
 */
@Service("customerService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class CustomerServiceImpl
    extends CustomerServiceBase
{
    public CustomerServiceImpl(
        CustomerDao customerDao,
        CustomerRepository customerRepository,
        MessageSource messageSource
    ) {
        
        super(
            customerDao,
            customerRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.imis.customer.CustomerService#findById(Long)
     */
    @Override
    protected CustomerVO handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  CustomerVO handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.customer.CustomerService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.customer.CustomerService#getAll()
     */
    @Override
    protected Collection<CustomerVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<CustomerVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.customer.CustomerService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.customer.CustomerService#getAll(Integer, Integer)
     */
    @Override
    protected Page<CustomerVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Page<CustomerVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.customer.CustomerService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.customer.CustomerService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.customer.CustomerService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.customer.CustomerService#save(CustomerVO)
     */
    @Override
    protected CustomerVO handleSave(CustomerVO customer)
        throws Exception
    {
        // TODO implement protected  CustomerVO handleSave(CustomerVO customer)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.customer.CustomerService.handleSave(CustomerVO customer) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.customer.CustomerService#search(String, Set<PropertySearchOrder>)
     */
    @Override
    protected Collection<CustomerVO> handleSearch(String criteria, Set<PropertySearchOrder> orderings)
        throws Exception
    {
        // TODO implement protected  Collection<CustomerVO> handleSearch(String criteria, Set<PropertySearchOrder> orderings)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.customer.CustomerService.handleSearch(String criteria, Set<PropertySearchOrder> orderings) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.customer.CustomerService#search(SearchObject<String>)
     */
    @Override
    protected Page<CustomerVO> handleSearch(SearchObject<String> criteria)
        throws Exception
    {
        // TODO implement protected  Page<CustomerVO> handleSearch(SearchObject<String> criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.customer.CustomerService.handleSearch(SearchObject<String> criteria) Not implemented!");
    }

}