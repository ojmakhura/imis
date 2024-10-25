// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.roguesystems.imis::policy::beneficiary::BeneficiaryService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.imis.policy.beneficiary;

import bw.co.roguesystems.imis.PropertySearchOrder;
import java.util.Collection;
import java.util.Set;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.imis.policy.beneficiary.BeneficiaryService
 */
@Service("beneficiaryService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class BeneficiaryServiceImpl
    extends BeneficiaryServiceBase
{
    public BeneficiaryServiceImpl(
        BeneficiaryDao beneficiaryDao,
        BeneficiaryRepository beneficiaryRepository,
        MessageSource messageSource
    ) {
        
        super(
            beneficiaryDao,
            beneficiaryRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.imis.policy.beneficiary.BeneficiaryService#findById(Long)
     */
    @Override
    protected BeneficiaryVO handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  BeneficiaryVO handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.policy.beneficiary.BeneficiaryService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.policy.beneficiary.BeneficiaryService#getAll()
     */
    @Override
    protected Collection<BeneficiaryVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<BeneficiaryVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.policy.beneficiary.BeneficiaryService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.policy.beneficiary.BeneficiaryService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.policy.beneficiary.BeneficiaryService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.policy.beneficiary.BeneficiaryService#save(BeneficiaryVO)
     */
    @Override
    protected BeneficiaryVO handleSave(BeneficiaryVO benefit)
        throws Exception
    {
        // TODO implement protected  BeneficiaryVO handleSave(BeneficiaryVO benefit)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.policy.beneficiary.BeneficiaryService.handleSave(BeneficiaryVO benefit) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.policy.beneficiary.BeneficiaryService#search(String, Set<PropertySearchOrder>)
     */
    @Override
    protected Collection<BeneficiaryVO> handleSearch(String criteria, Set<PropertySearchOrder> orderings)
        throws Exception
    {
        // TODO implement protected  Collection<BeneficiaryVO> handleSearch(String criteria, Set<PropertySearchOrder> orderings)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.policy.beneficiary.BeneficiaryService.handleSearch(String criteria, Set<PropertySearchOrder> orderings) Not implemented!");
    }

}