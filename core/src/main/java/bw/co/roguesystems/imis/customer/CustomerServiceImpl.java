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
import bw.co.roguesystems.imis.SortOrderFactory;

import java.util.Collection;
import java.util.Set;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
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
        return customerDao.toCustomerVO(customerRepository.getReferenceById(id));
    }

    /**
     * @see bw.co.roguesystems.imis.customer.CustomerService#getAll()
     */
    @Override
    protected Collection<CustomerVO> handleGetAll()
        throws Exception
    {

        return customerDao.toCustomerVOCollection(customerRepository.findAll());
    }

    /**
     * @see bw.co.roguesystems.imis.customer.CustomerService#getAll(Integer, Integer)
     */
    @Override
    protected Page<CustomerVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {

        PageRequest request = PageRequest.of(pageNumber, pageSize);
        
        return customerRepository.findAll(request).map(customerDao::toCustomerVO);
    }

    /**
     * @see bw.co.roguesystems.imis.customer.CustomerService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {

        customerRepository.deleteById(id);

        return true;
    }

    /**
     * @see bw.co.roguesystems.imis.customer.CustomerService#save(CustomerVO)
     */
    @Override
    protected CustomerVO handleSave(CustomerVO customer)
        throws Exception
    {
        Customer c = customerDao.customerVOToEntity(customer);
        c = customerRepository.save(c);

        return customerDao.toCustomerVO(c);
    }

    /**
     * @see bw.co.roguesystems.imis.customer.CustomerService#search(String, Set<PropertySearchOrder>)
     */
    @Override
    protected Collection<CustomerVO> handleSearch(String criteria, Set<PropertySearchOrder> orderings)
        throws Exception
    {

        Sort sort = SortOrderFactory.createSortOrder(orderings);

        Specification<Customer> spec = null;

        if(sort == null) {

            return customerDao.toCustomerVOCollection(customerRepository.findAll(spec));
        } else {

            return customerDao.toCustomerVOCollection(customerRepository.findAll(spec, sort));
        }

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