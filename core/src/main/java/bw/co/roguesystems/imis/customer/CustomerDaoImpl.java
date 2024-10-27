// Generated by hibernate/SpringHibernateDaoImpl.vsl in andromda-spring-cartridge on $springUtils.date.
// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package bw.co.roguesystems.imis.customer;

import bw.co.roguesystems.imis.policy.PolicyRepository;
import org.springframework.stereotype.Repository;

/**
 * @see Customer
 */
@Repository("customerDao")
public class CustomerDaoImpl
    extends CustomerDaoBase
{
    
    public CustomerDaoImpl(
        PolicyRepository policyRepository,
        CustomerRepository customerRepository
    ) {

        super(
            policyRepository,
            customerRepository
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void toCustomerVO(
        Customer source,
        CustomerVO target)
    {
        // TODO verify behavior of toCustomerVO
        super.toCustomerVO(source, target);
        // WARNING! No conversion for target.dateOfBirth (can't convert source.getDateOfBirth():java.util.Date to java.util.Date
        target.setDateOfBirth(target.getDateOfBirth());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerVO toCustomerVO(final Customer entity)
    {
        // TODO verify behavior of toCustomerVO
        return super.toCustomerVO(entity);
    }

    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private Customer loadCustomerFromCustomerVO(CustomerVO customerVO)
    {

        if (customerVO.getId() == null)
        {
            return  Customer.Factory.newInstance();
        }
        else
        {
            return this.load(customerVO.getId());
        }
    }

    /**
     * {@inheritDoc}
     */
    public Customer customerVOToEntity(CustomerVO customerVO)
    {
        // TODO verify behavior of customerVOToEntity
        Customer entity = this.loadCustomerFromCustomerVO(customerVO);
        this.customerVOToEntity(customerVO, entity, true);
        return entity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void customerVOToEntity(
        CustomerVO source,
        Customer target,
        boolean copyIfNull)
    {
        // TODO verify behavior of customerVOToEntity
        super.customerVOToEntity(source, target, copyIfNull);
        // No conversion for target.dateOfBirth (can't convert source.getDateOfBirth():java.util.Date to java.util.Date
        target.setDateOfBirth(target.getDateOfBirth());
    }
}