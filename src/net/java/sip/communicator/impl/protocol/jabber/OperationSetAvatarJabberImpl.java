/*
 * SIP Communicator, the OpenSource Java VoIP and Instant Messaging client.
 *
 * Distributable under LGPL license. See terms of license at gnu.org.
 */
package net.java.sip.communicator.impl.protocol.jabber;

import net.java.sip.communicator.service.protocol.*;

/**
 * A simple implementation of the <tt>OperationSetAvatar</tt> interface for the
 * jabber protocol.
 *
 * Actually there isn't any maximum size for the jabber protocol but GoogleTalk
 * fix it a 96x96.
 *
 * @author Damien Roth
 */
public class OperationSetAvatarJabberImpl extends
        AbstractOperationSetAvatar<ProtocolProviderServiceJabberImpl>
{

    /**
     * Creates a new instances of <tt>OperationSetAvatarJabberImpl</tt>.
     *
     * @param parentProvider a reference to the
     * <tt>ProtocolProviderServiceJabberImpl</tt> instance that created us.
     * @param accountInfoOpSet a reference to the
     * <tt>OperationSetServerStoredAccountInfo</tt>.
     */
    public OperationSetAvatarJabberImpl(
            ProtocolProviderServiceJabberImpl parentProvider,
            OperationSetServerStoredAccountInfo accountInfoOpSet)
    {
        super(parentProvider, accountInfoOpSet, 96, 96, 0);
    }

}
