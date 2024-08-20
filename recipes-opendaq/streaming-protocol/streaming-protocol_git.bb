SUMMARY             = "openDAQ streaming protocol"
AUTHOR              = "openDAQ d.o.o."
HOMEPAGE            = "https://opendaq.com/"
SECTION             = "openDAQ"
LICENSE             = "Apache-2.0"
PV                  = "1.2.1+git${SRCPV}"
DEPENDS             = "boost fmt libstream nlohmann-json spdlog"

inherit cmake

SRC_URI += "git://github.com/openDAQ/streaming-protocol-lt.git;protocol=https;branch=release/1.2"
SRCREV = "6f3644dbd2f5e29b1eff6260daa66b24ae3bb40f"
S = "${WORKDIR}/git"

LIC_FILES_CHKSUM += "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

EXTRA_OECMAKE += "\
    -DCMAKE_MODULE_PATH=${STAGING_DIR_TARGET}/usr/lib/cmake \
    -DFETCHCONTENT_FULLY_DISCONNECTED=ON \
"
