DESCRIPTION = "Very fast, header only, C++ logging library."
HOMEPAGE = "https://github.com/gabime/spdlog/wiki"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRCREV = "7c02e204c92545f869e2f04edaab1f19fe8b19fd"
SRC_URI = "git://github.com/gabime/spdlog.git;protocol=git;branch=v1.x; \
           file://0001-Enable-use-of-external-fmt-library.patch"

DEPENDS += "fmt"

S = "${WORKDIR}/git"

BBCLASSEXTEND = "native"
# no need to build example&text&benchmarks on pure yocto
EXTRA_OECMAKE += "-DSPDLOG_INSTALL=on -DSPDLOG_BUILD_SHARED=on -DSPDLOG_BUILD_EXAMPLES=off -DSPDLOG_BUILD_TESTS=off -DSPDLOG_BUILD_BENCH=off -DSPDLOG_FMT_EXTERNAL=on"

inherit cmake

# Header-only library
RDEPENDS_${PN}-dev = ""
RRECOMMENDS_${PN}-dbg = "${PN}-dev (= ${EXTENDPKGV})"