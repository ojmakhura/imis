// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: IMISModel::backend::bw.co.roguesystems.imis::kyc::KycService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.imis.kyc;

import bw.co.roguesystems.imis.PropertySearchOrder;
import java.util.Collection;
import java.util.Set;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.imis.kyc.KycService
 */
@Service("kycService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class KycServiceImpl
    extends KycServiceBase
{
    public KycServiceImpl(
        KycDao kycDao,
        KycRepository kycRepository,
        MessageSource messageSource
    ) {
        
        super(
            kycDao,
            kycRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.imis.kyc.KycService#findById(Long)
     */
    @Override
    protected KycVO handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  KycVO handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.kyc.KycService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.kyc.KycService#getAll()
     */
    @Override
    protected Collection<KycVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<KycVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.kyc.KycService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.kyc.KycService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.kyc.KycService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.kyc.KycService#save(KycVO)
     */
    @Override
    protected KycVO handleSave(KycVO kyc)
        throws Exception
    {
        // TODO implement protected  KycVO handleSave(KycVO kyc)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.kyc.KycService.handleSave(KycVO kyc) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.kyc.KycService#search(String, Set<PropertySearchOrder>)
     */
    @Override
    protected Collection<KycVO> handleSearch(String criteria, Set<PropertySearchOrder> orderings)
        throws Exception
    {
        // TODO implement protected  Collection<KycVO> handleSearch(String criteria, Set<PropertySearchOrder> orderings)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.kyc.KycService.handleSearch(String criteria, Set<PropertySearchOrder> orderings) Not implemented!");
    }

}